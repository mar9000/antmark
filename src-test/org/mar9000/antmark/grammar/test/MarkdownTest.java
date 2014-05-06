/**
 * This file is part of the ANTMark project.
 * 
 * ANTMark is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ANTMark is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ANTMark project.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2014 Marco LOMBARDO, mar9000 near google.com .
 */
package org.mar9000.antmark.grammar.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mar9000.antmark.MarkdownTranslator;
import org.mar9000.antmark.grammar.*;

@RunWith(value=Parameterized.class)
public class MarkdownTest {
	
	private static final String TESTS_DIR = "tests";
	private static final String MD_EXT = ".md";
	private static final String HTML_EXT = ".html";
	
	private String filename;
	private String markdownInput;
	private String htmlOutput;
	
	private static String readFileAsString(String filePath) throws IOException {
		StringBuffer fileData = new StringBuffer();
		BufferedReader reader = new BufferedReader(
				new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead=0;
		while((numRead=reader.read(buf)) != -1){
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
		}
		reader.close();
		return fileData.toString();
	}
	
	@Parameters(name="{0}")
	public static Collection<String[]> getTestParameters() {
		ArrayList<String[]> inoutPairs = new ArrayList<String[]>();
		try {
			File templateDir = new File(TESTS_DIR);
			if (!templateDir.isDirectory()) {
				return null;
			}
			addTestsFrom(templateDir, inoutPairs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(inoutPairs, new Comparator<String[]>() {
			@Override
			public int compare(String[] item1, String[] item2) {
				return item1[0].compareTo(item2[0]);
			}
		});
		return inoutPairs;
	}
	
	private static void addTestsFrom(File templateDir, ArrayList<String[]> inoutPairs)
	throws Exception {
		File[] files = templateDir.listFiles();
		for (int f = 0; f < files.length; f++) {
			if (files[f].isDirectory() && !files[f].getName().endsWith(".disabled")) {
				addTestsFrom(files[f], inoutPairs);
			} else if (files[f].getName().endsWith(MD_EXT) || files[f].getName().endsWith(".text")) {
				String filename = files[f].getName();
				/* Used to test only a smaller subset of tests.
				if (!filename.contains("blockq"))
					continue;
				*/
				String path = files[f].getAbsolutePath();
				String dir = path.substring(0, path.lastIndexOf("/"));
				String ext = filename.substring(filename.lastIndexOf("."));
				// Try .html .
				String htmlFilename = dir + "/" + filename.substring(0, filename.length()-ext.length())
						+ HTML_EXT;
				File htmlFile = new File(htmlFilename);
				if (!htmlFile.isFile()) {
					// Try .out .
					htmlFilename = dir + "/" + filename.substring(0, filename.length()-ext.length())
							+ ".out";
					htmlFile = new File(htmlFilename);
					if (!htmlFile.isFile()) {
						System.err.println(htmlFilename + " not found.");
						continue;
					}
				}
				String[] test = new String[3];
				test[0] = files[f].getName();
				// DOC: see note in Lexer setex heading about why we need this.
				test[1] = readFileAsString(files[f].getAbsolutePath()) + "\n";
				test[2] = readFileAsString(htmlFile.getAbsolutePath());
				inoutPairs.add(test);
			}
		}
	}
	
	public MarkdownTest(String filename, String input, String output) {
		this.filename = filename;
		this.markdownInput = input;
		this.htmlOutput = output;
	}

	@Test
	public void testInOut() throws Exception {
		System.out.println("Test " + filename);
		ANTLRInputStream input = new ANTLRInputStream(markdownInput);
		MarkdownLexer lexer = new MarkdownLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MarkdownParser parser = new MarkdownParser(tokens);
		ParseTree tree = parser.document();
		if (parser.getNumberOfSyntaxErrors() > 0) {
			throw new Exception("Syntax error in test " + filename);
		}
		//
		ParseTreeWalker walker = new ParseTreeWalker();
		MarkdownTranslator translator = new MarkdownTranslator(tree, parser);
		walker.walk(translator, tree);
		if (translator.isWithReferences()) {
			translator.clearHtml();
			walker.walk(translator, tree);
		}
		assertEquals(htmlOutput, translator.getHtml());
	}

}

package com.syntax.class24;

public class TestFile {

	public static void main(String[] args) {
		
		File java=new JavaFile();
		java.open();
		java.edit();
		java.close();
		File word=new WordFile();
		word.open();
		word.edit();
		word.close();
		File pdf=new PDFFile();
		pdf.open();
		pdf.edit();
		pdf.close();

	}

}

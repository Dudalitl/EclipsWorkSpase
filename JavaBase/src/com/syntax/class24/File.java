package com.syntax.class24;

public abstract class File {
	public void close() {
		System.out.println("File can be close");
	}
	public void edit() {
		System.out.println("File can be edit");
	}
	public abstract void open();
		
}

class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file we need notepad++ or sublime text");	
	}
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed");	
	}
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open .pdf file we need AcrobarReder to be installed");
	}
}

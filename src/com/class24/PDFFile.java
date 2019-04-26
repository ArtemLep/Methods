package com.class24;

public class PDFFile extends File {

	@Override
	public void edit() {
		System.out.println("to edit  PDF file we need PDF reader");

	}

	@Override
	public void close() {
		System.out.println("to close  PDF file we need PDF reader");
	}

}


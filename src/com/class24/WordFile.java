package com.class24;

public class WordFile extends File {

	@Override
	public void edit() {
System.out.println("to edit doc file we need Microsoft word to be installed");
	}

	@Override
	public void close() {
		System.out.println("to close doc file we need Microsoft word to be installed");
	}

}

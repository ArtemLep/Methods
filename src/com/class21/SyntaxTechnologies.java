package com.class21;

public class SyntaxTechnologies {

	String schoolName, year, lastDayOfClass;
	int batch;

	public SyntaxTechnologies() {

		this.schoolName = null;
		this.batch = 0;
		this.year = null;
		this.lastDayOfClass = null;
	}

	public SyntaxTechnologies(String sN, int b, String y, String lDOc) {
		this.schoolName = sN;
		this.batch = b;
		this.year = y;
		this.lastDayOfClass = lDOc;
	}

	void output() {
		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);

	}
}

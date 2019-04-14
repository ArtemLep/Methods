package com.class18;

/*
 * 2.  Create a Class called StudentsCreate three  variables  studentName , studentID  and  numberOfStudents

Create three objects of the Students Class

Set the value for  studentName , studentID and increment  the numberOfStudents for each object

Print out  total number of students
 */
public class Students {

	String studentName;
	int studentID;
	public static int numberOfStudents;

	public static void main(String[] args) {
		Students obj = new Students();
		Students obj1 = new Students();
		Students obj2 = new Students();

		obj.studentName = "Adam";
		obj.studentID = 0001;
		numberOfStudents++;

		obj1.studentName = "Frank";
		obj1.studentID = 0002;
		numberOfStudents++;

		obj2.studentName = "Boris";
		obj2.studentID = 0003;
		numberOfStudents++;
System.out.println("The total number of sutdents "+ numberOfStudents);

	}
}

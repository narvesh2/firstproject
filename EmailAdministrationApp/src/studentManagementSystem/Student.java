package studentManagementSystem;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int courseFees = 600;
	private int tuitionBalance = 0;
	private static int id = 1000;
	
	
	
	public Student() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the first name of the student");
		this.firstName = scan.nextLine();
		
		System.out.println("please enter the last name of the student");
		this.lastName = scan.nextLine();
		
		System.out.println("1 - freshmen /n 2 - junior /n 3- senior enter student's class level ");
		this.gradeYear = scan.nextInt();
		
		setStudentId();
		
		System.out.println(firstName  +" " + lastName + " " + gradeYear + " "+ studentId);
		
		
	}
	
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//enroll in the course
	private void courseEnrollment() {
		System.out.println("enter course to enroll; Q to quit");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(courses != "Q") {
			courses = courses + "/n" + course;
			tuitionBalance = tuitionBalance + courseFees;
		}
		System.out.println("enrolled in" + courses);
		System.out.println("Tutionbalance: " + tuitionBalance);
	}
	
}

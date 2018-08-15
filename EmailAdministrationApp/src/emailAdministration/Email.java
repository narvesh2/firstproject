package emailAdministration;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String fName;
	private String lName;
	private String department;
	private String password;
	private int defaultrandomPassword = 15;
	private String email;
	private int mailbox;
	private String alternateEmail;
	private String companySuffix = "@xy.com";
	
	//constructors
	public Email(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
		System.out.println("EMAIL CREATED: "+ this.fName + " " + this.lName);
		this.department = setDepartment();
		System.out.println("DEPARTMENT: "+ this.department);
		
		this.password = randomPassword(defaultrandomPassword);
		System.out.println("your password is: "+ this.password);
		
		email = fName.toLowerCase() + "." + lName.toLowerCase()+ department +"." + companySuffix;
		System.out.println(email);
	}
	
	//set department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:  /n 1 for Sales /n 2 for Development /n 3 for Accounting /n enter the department:"
				+ "/n 4 for None");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		
		if(departmentChoice == 1) {return "Sales";}
		else if(departmentChoice ==2) {return "Development";}
		else if(departmentChoice == 3) {return "Accounting";}
		else return "None";
		
	}
	 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!£$%^&*()_";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//mailbox capacity
	public void mailboxCapacity(int capacity) {
		this.mailbox = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
		System.out.println(password);
	}
	
	public int getMailboxCapacity() {
		return mailbox;
	}
	
}

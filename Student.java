package studentdatabase;

import java.util.Scanner;

public class Student {
	
	private String FirstName; 
	private String LastName; 
	private String GradeYear; 
	private String StudentId; 
	private String course = null; 
	private int tuitionbalance = 0;  
	private static int CostofCourse = 600;
	private static int id = 1000;
	
	//Constructor: prompt user to enter Student's name and year 
	public Student() { 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.FirstName = in.nextLine(); 
		
		System.out.println("Enter student last name: ");
		this.LastName = in.nextLine();
		
		System.out.println("Enter student grade level (1-Freshman 2-Sophmore 3-Junior 4-Senior): ");
		this.GradeYear = in.nextLine();
		System.out.println(FirstName + " " + LastName + " " + GradeYear);
		
		setStudentID();
	
	}
	//Generate id 
	private void setStudentID() { 
		//Grade level + ID 
		id++;
		this.StudentId = GradeYear + "" + id; 
		
	}
	
	//Enroll in courses 
	public void enroll() { 
		//get inside a loop, user hits 0 
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String courses = in.nextLine(); 
		
			if(!courses.equals("Q")) {
				course = course + "\n" + courses; 
				tuitionbalance = tuitionbalance + CostofCourse;
			
			} else { 
				break;
			}
			
		} while( 1!= 0);
		
		
	}
	
	//view balance 
	public void viewBalance() { 
		System.out.println("Your balance is: $" + tuitionbalance);
	}
	
	//pay tuition
	public void payTuition() { 
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
		
	}
	
	
	//show status 
	public String toString() { 
		return "Name: " +FirstName + " " + LastName + 
				"\nGrade Level: " + GradeYear + 
				"\nStudent ID: " + StudentId +
				"\nCourses Enrolled: " + course + 
				"\nBalance: $" + tuitionbalance;
	}
	
	

}

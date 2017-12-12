package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask user for major, concentration, current year, and semester
		System.out.println("Please enter your current year (ex. 1 is Freshman): ");
		int year = input.nextInt();
	
		System.out.println("Please enter the semester you will be registering for (ex. 1 is fall): ");
		int semester = input.nextInt();
		
		System.out.println("Please enter your major: ");
		String major = input.next();
		
		if(major.equals ("ComputerScience")) {
			System.out.println("What is your concentration?");  //Ask user for concentration in CS
			String c = input.next();  // Assign concentration to c
			if(year == 1) {
				System.out.println("Recommended courses for this semester: ");
				if(semester == 1) {
					System.out.println("CMPT 120 Introduction to Programming");
					System.out.println("MATH 130 Introduction to Statistics");
					System.out.println("BUS 100 Introduction to Business and Management");
					System.out.println("ENG 120 Writing for College");
					System.out.println("PHIL 101  Philosophical Perspectives");
				} else {
					System.out.println("CMPT 220 Software Development I");
					System.out.println("CMPT 230 Software Systemes and Analysis");
					System.out.println("MATH 205 Discrete Math I");
					System.out.println("FYS 101 First-Year Seminar");
				}
			} else if(year == 2) {
				if(semester == 1) {
					System.out.println("CMPT 306 Data Communications and Networks");
					System.out.println("CMPT 221 Software Development II");
					System.out.println("CMPT 308 Database Management");
					System.out.println("Core/LS");
				} else {
					System.out.println("MATH 241 Calculus I");
					System.out.println("CMPT 307 Internetworking");
					System.out.println("CMPT 330 System Design");
					System.out.println("Core/LS");
				}
			} else if(year == 3 && c.equals("SoftwareDevelopment")) {
				if(semester == 1) {
					System.out.println("CMPT 422 Computer Org. & Architecture");
					System.out.println("Concentration elective");
					System.out.println("CMPT 305 Technology, Ethics, and Society");
					System.out.println("Core/LS");
				} else {
					System.out.println("CMPT 435 Algorithm Analysis and Design");
					System.out.println("Concentration elective");
					System.out.println("Core/general elective");
				}
			} else {
				if(semester == 1) {
					System.out.println("CMPT 475 CS Project I");
					System.out.println("Core/LS");
					System.out.println("Elective/Internship");
				} else {
					System.out.println("CMPT 476 CS Project II");
					System.out.println("Concentration elective");
					System.out.println("Core/LS");
					System.out.println("Elective/Internship");
				}
			}
	   }
		
		// Ask user to input course name, day(s) the class meets, and time(s) the class meets
		
		System.out.println(" ");	
		System.out.println("Please enter the following ");
		
		System.out.println("Course name (ex. CMPT220) ");
		
		String name = input.next();
		
		System.out.println("Number of days class meets ");
		
		int meet = input.nextInt();
		
		System.out.println("Day(s) class meets (M, T, W, Th, F) ");
        String day = input.next();
		
		for (int i = 1; i < meet; i++) {
			day = day + input.next();
		}
		
		System.out.println("Class meeting time (ex. 11:00-12:30) ");
		
		String time = input.next();
		
		
		System.out.println("---------------------------------------");
		System.out.println(name + " | " +  day + " | " + time); 

	}

}

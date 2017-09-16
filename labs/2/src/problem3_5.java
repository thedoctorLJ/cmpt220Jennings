import java.util.Scanner;

/* Write a program that prompts the user to enter an integer for today's day of the week 
   and the number of days after today for a future day and display the future day of the week. */
public class problem3_5 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input today's day
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		
		// Prompt user to input number of days after today
		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// Determine future day
		int futureday = (daysElapsed + today) % 7;
		
		// Print out current day and prevent blank
		if(today > 6) {
			System.out.print("Please enter a valid day");
		} else {
			System.out.print("Today is ");
			switch(today) {
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday");
		}
		
	}
		
		
		// Print out future day and prevent blank
		if(today > 6) {
			System.out.print("Please enter a valid day");
		} else {
		System.out.print(" and the future day is ");
		switch(futureday) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
		
	  }  
   }

}


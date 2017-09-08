// Program that calculates number of years and days remaining from minutes input from user
import java.util.Scanner;

public class Problem2_7 {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a value in minutes
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		// Assuming that a year has 365 days calculate years and remaining days for minutes input
		// Calculate years 60m/hr 24hr/day 365days/yr
		int years = (int) minutes / (60 * 24 * 365); // Calculate years 60m/hr 24hr/day 365days/yr
		
		// Calculate days left Remaining minutes converted into days  
		int days = minutes % (60 * 24 * 365) / (24 * 60); 
			
		// Display years and days
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}

}

import java.util.Scanner;
/* Write a program that prompts the user to enter the month and year and displays 
 * the number of days in the month
 */
public class problem3_11 {
	public static void main(String[] args) {
		// testing % 
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get User input for month
		System.out.println("Enter a month (digit): ");
		int month = input.nextInt();
		
		// Get user input for year
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		// Check for valid month
		if(month > 12 || month < 0) {
			System.out.println("Please enter a valid month");
			} // Check for leap year 
		else if(year % 4 == 0 && month == 2) { 
			System.out.println("Febuary " + year + " has 29 days.");
		} // print out month, year, and days in designated month
		else {switch(month) {
		case 1: System.out.println("January " + year + " has 31 days."); break;
		case 2: System.out.println("Febuary " + year + " has 28 days."); break;
		case 3: System.out.println("March " + year + " has 31 days."); break;
		case 4: System.out.println("April " + year + " has 30 days."); break;
		case 5: System.out.println("May " + year + " has 31 days."); break;
		case 6: System.out.println("June " + year + " has 30 days."); break;
		case 7: System.out.println("July " + year + " has 31 days."); break;
		case 8: System.out.println("August " + year + " has 31 days."); break;
		case 9: System.out.println("September " + year + " has 30 days."); break;
		case 10: System.out.println("October " + year + " has 31 days."); break;
		case 11: System.out.println("November " + year + " has 30 days."); break;
		case 12: System.out.println("December " + year + " has 31 days."); break;
		}
		
		}
		



	}

}

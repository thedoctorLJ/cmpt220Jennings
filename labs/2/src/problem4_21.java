import java.util.Scanner;

// Write a program that prompts the user to enter a Social Security number and checks whether the input is valid
public class problem4_21 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter a SSN in the form (DDD-DD-DDDD where D is a digit) : ");
		String social = input.nextLine();
		
		// Check for valid input print result
		if (social.length() == 11 && 
			Character.isDigit(social.charAt(0)) &&
			Character.isDigit(social.charAt(1)) &&
			Character.isDigit(social.charAt(2)) &&
			social.charAt(3) == '-' &&
			Character.isDigit(social.charAt(4)) &&
			Character.isDigit(social.charAt(5)) &&
			social.charAt(6) == '-' &&
			Character.isDigit(social.charAt(7)) &&
		    Character.isDigit(social.charAt(8)) &&
			Character.isDigit(social.charAt(9)) &&
			Character.isDigit(social.charAt(10))) {
				System.out.println(social + " is a valid Social Security number");
			} else {
				System.out.println(social + " is an invalid Social Secuity number");
			}
				

	}

}

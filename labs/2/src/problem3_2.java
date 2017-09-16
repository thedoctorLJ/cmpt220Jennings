import java.util.Scanner;

/* Revise program to generate three single-digit integers and prompt the user 
to enter the sum of these three integers */
public class problem3_2 {

	public static void main(String[] args) {
		// Initialize variables
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);
		int number3 = (int) (Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the sum of three integers
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		// Display whether user response was correct or not
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " 
				+ answer + " is " + (number1 + number2 + number3 == answer));
		

	}

}

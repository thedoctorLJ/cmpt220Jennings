import java.util.Scanner;

// Program that calculates gratuity
import java.util.Scanner;

public class Problem2_5 {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a subtotal and a gratuity rate
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble() / 100;
		
		// Calculate gratuity
		double gratuity = subtotal * rate;
		
		// Calculate total
		double total = subtotal + gratuity;
		
		// Display gratuity and total
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		

	}

}

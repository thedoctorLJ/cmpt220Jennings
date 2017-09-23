import java.util.Scanner;

// Write a program that reads an integer and displays all its smallest factors in increasing order.
public class Problem5_16 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for integer input
		System.out.println("Enter an integer: ");
		
		// Initialize variables
		int x = input.nextInt();
		int i = 2; 
		
		// Calculate and display smallest factors in increasing order
		while (x / i != 1) {
			if (x % i == 0) {
				System.out.print(i + ", ");
				x /= i;
			} else
				i++; // increment index
		}
		System.out.println(x + ".");

	}

}

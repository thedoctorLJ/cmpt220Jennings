import java.util.Scanner;

/* Write a program that reads an unspecified number of integers, determines how many positive and negative values
 * have been read, and computes the total and average of the input values (not counting zeroes). Your program
 * ends with the input 0. Display the average as a floating-point number.
 */
public class Problem5_1 {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		// Initialize variables
		double x = input.nextDouble();
		int count = 0;
		int positive = 0;
		int negative = 0;
		int sum = 0;
		
		if (x == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		
		// Create loop that checks for sentinel value of 0
			while (x != 0) {
			if (x > 0) {
				positive++; // Increase positive count 
			} else {
				negative++; // Increase negative count
			} 
			sum += x;
			count++;
			x = input.nextDouble();
		}
			
			// Calculate the average
			double average = sum / count;
			
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + average);

	}

}

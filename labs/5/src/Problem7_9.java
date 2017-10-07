import java.util.Scanner;

/* Write a test program that prompts the user to enter 10 numbers, invokes this method to return the 
 * minimum value and displays the minimum value
 */
public class Problem7_9 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in); 
		
		// Create an array 
		double[] numbers = new double[10]; 

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Display the minimum value
		System.out.println("The minimum number is: " + min(numbers));
	}

	// Method min returns the smallest element in an array of double values 
	public static double min(double[] array) {
		// The minimum value
		double min = array[0];	
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}

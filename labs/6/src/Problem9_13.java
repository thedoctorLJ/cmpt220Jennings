import java.util.Scanner;

/* Write a test program that prompts the user to enter a two-dimensional array and displays
 * the location of the largest element in the array
 */
// I could not understand why the program failed to run

public class Problem9_13 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter the number of rows and columns in the array: ");
		
		// Declare variables
		int row = input.nextInt();
		int column = input.nextInt();
		
		// Create 2-Dimensional array using variables above
		double[][] array = new double[row][column];
		
		// Prompt user to input array values
		System.out.println("Enter the array: ");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		Location location = Location.locateLargest(array);
		
		
		System.out.println("The location of the largest element is "
				+ location.maxValue + "at (" + location.row + ", " + location.column+ ")");

	}

} 


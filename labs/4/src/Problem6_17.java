import java.util.Scanner;

// Write a program that prompts the user to enter n and displays an n-by-n matrix. 
public class Problem6_17 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter n
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		// Display an n-by-n matrix
		printMatrix(n);

	}
	
	// Method that displays an n-by-n matrix
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) {
				// Randomly generate 0 or 1 then print
				System.out.print((int)(Math.random() * 2));
			}
			// Print a new line
			System.out.println();
		}
	}

}

import java.util.Scanner;

// Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
public class Problem7_3 {

	public static void main(String[] args) {
		
		// Create an array that counts the occurrences of numbers
		int[] x = new int[100];
		
		// Prompt the user to enter integers between 1 and 100
		System.out.print("Enter the integers between 1 and 100: ");
		
		// Count occurrences of numbers
		count(x);
		
		// Display results
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 0)
				System.out.println((i + 1) + " occurs " + x[i] +
				" time" + (x[i] > 1 ? "s" : ""));
		}

	}
	
	// Method between reads integers between 1 and 100 and counts the occurence of each
	public static void count(int[] x) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		int n; // For user input
		do {
			n = input.nextInt();
			if (n >= 1 && n <= 100)
				x[n - 1]++;
		} while (n != 0);
	}

}

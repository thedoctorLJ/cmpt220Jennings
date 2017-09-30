import java.util.Scanner;

/* Write a program that reads in 10 numbers and displays the number of distinct numbers and the 
 * distinct numbers in their input order and separated by exactly one space. AFter the input,
 * the array contains the distinct numbers. 
 */
public class Problem7_5 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Create an array to store distinct numbers
		int[] distinctNumbers = new int[10];
		int x; // variable for user input
		int count = 0;
		
		// Prompt user to enter 10 numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			x = input.nextInt();
			
			// Test for distinct number
			if (distinct(distinctNumbers, x)) {
				distinctNumbers[count] = x;
				count++;
			}
		}
		
		// Display the number of distinct numbers and the distinct numbers separated by one space
		System.out.println("The number of distinct numbers is " + count);
		System.out.println("The distinct number are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();

	}
	
	// Method returns true if number is not in array, otherwise false
	public static boolean distinct(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			if (x == array[i])
				return false;
		}
		return true;
	}

}

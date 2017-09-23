import java.util.Scanner;

/* Write a method to display three numbers in increasing order. Write a test program that prompts the user
 * to enter three numbers and invokes the method to display them in increasing order
 */
public class Problem6_5 {
   // Main method
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter three numbers
		System.out.println("Enter three numbers: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Display numbers in increasing order
		displaySortedNumbers(x, y, z);

	}
// displays three numbers in increasing order
private static void displaySortedNumbers(
	double x, double y, double z){
		double temp; // Holds number to swap 
		
		if (y < x && y < z) {
			temp = x;
			x = y;
			y = temp;
		} else if (z < x && z < y) {
			temp = x;
			x = z;
			z = temp;
		} if (z < y) {
			temp = y;
			y = z;
			z = temp;
		}
	// Display result
System.out.println(x + " " + y + " " + z);
 }
}


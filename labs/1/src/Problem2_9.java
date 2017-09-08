// Program that displays average acceleration from user input starting and ending velocity in m/s
import java.util.Scanner;

public class Problem2_9 {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input starting velocity (v0) in m/s, ending velocity (v1) in m/s, and time span (t) in seconds
		System.out.println("Enter v0, v1, and t: ");
		double v0 = input.nextDouble(); // initialize variable for starting velocity
		double v1 = input.nextDouble(); // initialize variable for ending velocity
		double t = input.nextDouble(); // initialize variable for time span 
		
		// Calculate average acceleration (a) which can be found by a = (v1 - v0) / (t)
		double a = (v1 - v0) / t; // initialize variable for average acceleration
		
		// Display average acceleration
		System.out.println("The average acceleration is " + a);
	}

}

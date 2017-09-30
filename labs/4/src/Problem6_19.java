import java.util.Scanner;

/* Write a test program that reads three sides for a triangle and uses the isValid method
 * to test if the input is valid and uses the area method to obtain the area. 
 * The program displays the area if the input is valid. Otherwise, it displays that the input is invalid.
 */
public class Problem6_19 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input three sides of a triangle
		System.out.println("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Calculate area if input is valid. If not display input is invalid.
		System.out.println(isValid(side1, side2, side3) ? 
				"The area of the triangle is " + area(side1, side2, side3) :
					"Input is invalid");

	}
	// Return true if the sum of every two sides is greater than the third side
	public static boolean isValid(
		double side1, double side2, double side3) {
		boolean valid = 
				side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}
	
	// Return the area of the triangle
	public static double area(
			double side1, double side2, double side3) {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

}

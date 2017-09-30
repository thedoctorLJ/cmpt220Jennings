import java.util.Scanner;

// Write a test program that prompts the user to enter 10 numbers and displays the mean and standard deviation
public class Problem7_11 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Create an array
		double[] numbers = new double[10]; 

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Output the mean and standard deviation
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}

	// Compute the deviation of double values 
	public static double deviation(double[] x) {
		double deviation = 0;
		double mean = mean(x);
		for (double e: x) {
			deviation += Math.pow(e - mean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}

	// Compute the mean of an array of double values 
	public static double mean(double[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}
}
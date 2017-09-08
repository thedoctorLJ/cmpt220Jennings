//Program that Converts Celsius to Fahrenheit 
import java.util.Scanner;

public class Problem2_1 {
	
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter degrees Celsius
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		//Convert Celsius to Fahrenheit
		double fahrenheit = (9.0/5) * celsius + 32;
		
		// Display results
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
		
	}

}

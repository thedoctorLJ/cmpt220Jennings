import java.util.Scanner;
// Write a program that receives a character and displays its Unicode. 
public class problem4_9 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a character
		System.out.println("Enter a character: ");
		String s = input.nextLine();
		char ch =  s.charAt(0);
		
		// Display Unicode of entered character
		System.out.println((int)ch);
		
		

	}

}

import java.util.Scanner;

// Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant
// For non letter input, display 
public class problem4_13 {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter a letter: ");
		
		// Translate user input into char
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		// Determine character type and print out response
		if(Character.isLetter(ch)) {
			switch(Character.toUpperCase(ch)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println(ch + " is a vowel"); break;
			default : System.out.println(ch + " is a consonant");
			}
		} else System.out.println(ch + " is an invalid input");		

	}

}

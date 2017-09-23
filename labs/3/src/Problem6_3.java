import java.util.Scanner;

/* Use the reverse method to implement isPalindrome. Write a test program that prompts
 * the user to enter an integer and reports whether the integer is a palindrome.
 */
public class Problem6_3 {
   // Main method
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter an integer
		System.out.println("Enter an integer: ");
		int x = input.nextInt();
		
		// Display palindrome status 
		System.out.println(x + (isPalindrome(x) ? " is " : "is not ") + "a plaindrome.");

	}

private static boolean isPalindrome(int x) {
	return x == reverse(x) ? true : false;
}

private static int reverse(int x) {
	String reverse = ""; 
	String n = x + "";
	// Reverse string
	for (int i = n.length() - 1; i >= 0; i--) {
		reverse += n.charAt(i);
	}
	return  Integer.parseInt(reverse);
}

}

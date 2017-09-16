import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// testing % 
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get User input
		System.out.println("Enter a value for x for the expression (x) % 7 = ?: ");
		
		int x = input.nextInt();
		int answer = (x) % 7;
		
		// Display answer
		System.out.println(answer);
				

	}

}

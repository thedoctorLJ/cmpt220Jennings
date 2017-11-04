import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_11 {
	
	public static void main(String[] args) {
		
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		// Make an ArrayList of integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Prompt user for input
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		// Sort numbers
		sort(list);
		
		// Display list in ascending order
		System.out.println(list.toString());
	}
	
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}

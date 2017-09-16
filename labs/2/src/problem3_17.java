import java.util.Random;
import java.util.Scanner;

// Write a rock-paper-scissors game
public class problem3_17 {
	public static void main(String args[]) {
		// Create a scanner
		Scanner input = new Scanner(System.in); 
		
		// Prompt user for input
		System.out.println("Scissor (0), Rock (1), Paper (2): ");
		
		// Take user input
		int selection = input.nextInt();
		
		// Generate Computer selection
		Random rand = new Random();
		int computer = rand.nextInt(3); 
		
		// Determine Winner and print out results
		if(selection == 0 && computer == 0) {
			System.out.println("The computer is scissor. You are scissor too. It is a draw.");
		} else if(selection == 0 && computer == 1) {
			System.out.println("The computer is rock. You are scissor. You lose.");
		} else if(selection == 0 && computer == 2) {
			System.out.println("The computer is paper. You are scissor. You win.");
		} else if(selection == 1 && computer == 0) {
			System.out.println("The computer is scissor. You are rock. You win.");
		} else if(selection == 1 && computer == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		} else if(selection == 1 && computer == 2) {
			System.out.println("The computer is paper. You are rock. It is a draw");
		} else if(selection == 2 && computer == 0) {
			System.out.println("The computer is scissor. You are paper. You lose.");
		} else if(selection == 2 && computer == 1) {
			System.out.println("The computer is rock. You are paper. You win.");
		} else if(selection == 2 && computer == 2) {
			System.out.println("The computer is paper. You are paper too. It is a draw.");
		}  
	}

}

import java.util.Scanner;

// Write a program that reads information and prints a payroll statement
public class problem4_23 {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Ask for user information and initialize variables
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		double fedrate = federal * 100; // turn decimal into percentage
		
		System.out.println("Enter state tax withholding rate ");
		double state = input.nextDouble();
		double staterate = state * 100; //turn decimal into percentage
		
		// Calculate gross pay (pre-tax pay)
		double gross = rate * hours;
		
		// Calculate Deductions (taxes)
		double fed = gross * federal;
		double st = gross * state;
		double deductions = fed + st;
		
		// Calculate Net Pay
		double net = gross - deductions;
		
		// Print payroll statement
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + gross);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding (" + fedrate + "%): $" + fed);
		System.out.println("State Wihtholding (" + staterate + "%): $" + st);
		System.out.println("Total Deduction: $" + deductions);
		System.out.println("Net Pay: $" + net);

	}

}

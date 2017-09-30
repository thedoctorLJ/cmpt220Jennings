// Write a method to compute: (i)/(i+1)
public class Problem6_13 {

	public static void main(String[] args) {
		// Display table with i values from 1-20 and the corresponding output of m(i)
		double x  =  1.0;	// Start value
		double y = 20.0;	// End value

		// Display header
		System.out.println("\ni         m(i)     ");
		System.out.println("-------------------");

		// Display table
		for (double i = x; i <= y; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sum(i));
		}
	}

	// Method sum: computes the series
	public static double sum(double n) {
		double sum = 0;	// Sum of the series
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}
} 


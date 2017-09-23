// Write a program that displays two tables shown side by side
public class Problem5_5 {

	public static void main(String[] args) {
		
		// Initialize variable for pounds per kilogram
		final double poundsPerKilo = 2.2;
		
		// Display table headers
		System.out.println(
				"Kilograms    Pounds    |    Pounds    Kilograms");
		for (int k = 1, p = 20; k <= 199 && p <= 515; k +=2, p += 5) {
			System.out.printf(
					"%-12d%7.1f", 
					k, (k + poundsPerKilo));
			System.out.print("    |    ");
			System.out.printf(
					"%-9d%12.2f\n", 
					p, (p / poundsPerKilo));
		}

	}

}

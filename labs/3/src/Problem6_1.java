/* Write a method that returns a pentagonal number.  Write a test program that uses this method 
 * to display the first 100 pentagonal numbers with 10 numbers on each line. Use the %7d format to display each number
 */
public class Problem6_1 {
    // Main method
	public static void main(String[] args) {
		final int numOfPentagonals = 100;
		final int numPerLine = 10;
		
		// Display the first 100 pentagonal numbers
		System.out.println("The first 100 pentagon numbers are: ");
		for (int i = 1; i <= numOfPentagonals; i++) {
			if (i % numPerLine == 0) {
				System.out.printf("%7d\n", getPentagonalNumber(i));
			} else {
				System.out.printf("%7d",  getPentagonalNumber(i));
			}
			
		}

	}

	private static Object getPentagonalNumber(int i) {
		// TODO Auto-generated method stub
		return (i * (3 * i - 1)) / 2;
	}

}

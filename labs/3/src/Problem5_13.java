// Use a while loop to find the largest integer n such that n^3 < 12,000
public class Problem5_13 {

	public static void main(String[] args) {
		// Initialize variable n
		int n = 0;
		
		while (Math.pow(n + 1, 3) < 12000) {
			n++;
		}
		
		// Display result
		System.out.println("The largest integer such that n^3 is < 12000 is: " + n);

	}

}

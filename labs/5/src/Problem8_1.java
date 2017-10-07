import java.util.Scanner;

/* Write a method that returns the sum of all the elements in a specified column in a matrix.
 * Write a test program that reads a 3 x 4 matrix and displays the sum of each column.
 */
public class Problem8_1 {

	public static void main(String[] args) {
		System.out.print("Enter a 3 X 4 matrix: ");
        Scanner input = new Scanner(System.in);

        // read user input: 3 x 4 matrix
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i +" is " + sumColumn(matrix, i));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {

        double total = 0;

        for (int i = 0; i < m.length; i++) {
            total += m[i][columnIndex];
        }
        return total;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%5.0f ", matrix[row][column]);
            }
            System.out.printf("\n");
        }
    }

}
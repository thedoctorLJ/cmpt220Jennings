import java.util.Scanner;

// UML diagram
/*
*                    LinearEquation                  *
*----------------------------------------------------*
* -a: double                                         *
* -b: double                                         *
* -c: double                                         *
* -d: double                                         *
* -e: double                                         *
* -f: double                                         *
* +LinearEquation(a: double, b: double, c: double,   * 
*                 d: double, e: double, f: double)   *
* +getA(): double                                    *
* +getB(): double                                    *
* +getC(): double                                    *
* +getD(): double                                    *
* +getE(): double                                    *
* +getF(): double                                    *
* +isSolvable(): boolean                             *
* getX(): double                                     *
* getY(): double                                     *
*/
public class Problem9_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linear = new LinearEquation(a,b,c,d,e,f);

        if (linear.isSolvable()) {
            System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }

}
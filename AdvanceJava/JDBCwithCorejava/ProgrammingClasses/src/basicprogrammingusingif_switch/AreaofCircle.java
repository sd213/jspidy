/**
 * W.A.J.P to find out Area of Circle
 */
package basicprogrammingusingif_switch;

import java.util.Scanner;

/**
 * 
 */
public class AreaofCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius Of Circle :- ");
		double radius = s.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("Area of Circle is " + area);
	}

}

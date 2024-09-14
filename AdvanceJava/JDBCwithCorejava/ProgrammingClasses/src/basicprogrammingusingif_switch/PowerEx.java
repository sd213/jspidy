/**
	W.A.J.P to find Power
 * 
 */
package basicprogrammingusingif_switch;

import java.util.Scanner;

/**
 * 
 */
public class PowerEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base");
		int base = s.nextInt();
		System.out.println("Enter Exp");
		int exp = s.nextInt();
		System.out.println("Math.Power of given num : " + Math.pow(base, exp));


	}

}

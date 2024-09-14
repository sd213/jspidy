/**
	Define a method to accept an integer value & return second digit from the given number.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class ReturningSecondDigit {

	public static int secondDigit(int a) {
		int n = Math.abs(a);
		while(n>99) {
			n/=10;
		}
		return n%10;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		System.out.println(secondDigit(n));

	}

}

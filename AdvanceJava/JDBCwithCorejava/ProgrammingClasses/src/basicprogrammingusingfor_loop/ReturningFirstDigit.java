/**
Define a method to accept an integer value & return first digit of the number
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class ReturningFirstDigit {
	public static int firstDigit(int n) {
		while(n>9) {
			n/=10;
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		System.out.println(firstDigit(n));
	}

}

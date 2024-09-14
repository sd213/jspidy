/*
 *  Define a method to accept an integer value & print the digits from first.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrintingDigitsFromFirst {

	public static int rev_Digit(int n) {
		int rev = 0;
		while(n>0) {
			rev = rev * 10 + (n%10);
			n = n/10;
		}
		return rev;
	}
	public static void printFromFirstDigit(int n) {
		int a = rev_Digit(n);
		int rem = 0;
		while (a>0) {
			rem = a %10;
			System.out.println(rem);
			a = a/10;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		printFromFirstDigit(new Scanner(System.in).nextInt());
	}

}

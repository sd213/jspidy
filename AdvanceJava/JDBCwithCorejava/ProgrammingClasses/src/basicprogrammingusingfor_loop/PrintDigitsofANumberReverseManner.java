/*
 * Write a Javaprogram to print digits of a given number from last
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrintDigitsofANumberReverseManner {
	
	public static void main(String[] args) {
		System.out.println("Enter Number ");
		int a = new Scanner(System.in).nextInt();
		int n =a , rem =0;
		while(n > 0) {
			rem = n%10;
			n = n/10;
			System.out.println(rem);
		}
	}
}

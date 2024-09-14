/*
 * Define a method to accept a integer value and print factors for the given number
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrintFactorsofGivenNumber {
	static void factor(int n) {
		for( int i = 1; i <= n; i++) {
			if(n%i ==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		int n = new Scanner(System.in).nextInt();
		factor(n);
	}

}

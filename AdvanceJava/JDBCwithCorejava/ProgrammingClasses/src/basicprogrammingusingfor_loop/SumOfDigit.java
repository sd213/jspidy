/*
 *  Define a method to accept an integer value & return sum of digits of the number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class SumOfDigit {

	public static int sum(int n) {
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Sum of digit of given Number "+ sum(n));
	}

}

/*
 * /*
 *  Define a method to accept integer value and return sum of odd digits of the number.
 */
 
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class SumOfOddDigits {

	public static int oddsum(int n) {
		int sum = 0;
		while(n>0) {
			if((n%10)%2 != 0)
				sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Sum of Odddigit of given Number "+ oddsum(n));
	}

}

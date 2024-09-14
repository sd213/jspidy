/*
 *  Define a method to accept an integer value and return smallest digit in num.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class ReturnSmallestDigitofNumber {

	public static int smallestDigit(int n) {
		int min = n % 10;
		n /= 10;
		if(n>9) {
			while(n>0) {
				int last = n%10;
				if(last < min) 
					min = last;
				n /= 10;
				
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		System.out.print("Enter a Number:- ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(smallestDigit(n));
	}
}

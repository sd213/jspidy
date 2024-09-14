/*
 *  Define a method to accept an integer value and return greatest digit in num.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class ReturnGreatestIntegerDigitofNumber {

	public static int greatestDigit(int n) {
		int max = n % 10;
		n /= 10;
		if(n>9) {
			while(n>0) {
				int last = n%10;
				if(last > max) 
					max = last;
				n /= 10;
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.print("Enter a Number:- ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(greatestDigit(n));
	}

}

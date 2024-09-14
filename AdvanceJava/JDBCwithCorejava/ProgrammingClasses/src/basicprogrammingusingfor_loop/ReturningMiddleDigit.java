/**
	Define a method to accept an integer value & return middle digit.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class ReturningMiddleDigit {

	public static int secondDigit(int a) {
		int n = Math.abs(a);
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		if(count %2 != 0) {
			count = count/2;
			while(a>0) {
				a = a/10;
				count--;
				if(count == 0) {
					break;
				}
			}
			return a %10;
		}else {
			System.out.println("Even Number");
			return -1;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int mid = secondDigit(new Scanner(System.in).nextInt());
		if(mid != -1) {
			System.out.println("Mid :"+mid);
		}
		else {
			System.out.println("Try Again with odd Number Digit");
		}
		
	}

}

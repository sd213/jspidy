/**
	Define a method to accept Adhaar Number and return true if it is valid or else false.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class AdharNumberValidation {
	public static boolean validation(long n) {
		int count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		if(count == 12) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter Adhar Number:- ");
		long a = new Scanner(System.in).nextLong();
		if(validation(a)) {
			System.out.println("Valid Adhaar Number");
		}
		else {
			System.out.println("Invalid Adhaar Number");
		}
	}

}

/*
 * Define a method to accept a integer value and return if integer is composite or not.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrimeNumberOrNot {

	static boolean factor(int n) {
		if(n == 1)
			return false;
		for(int i = 1; i<= n/2;i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter n value: ");
		int n = new Scanner(System.in).nextInt();
		if(factor(n)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}

}

/*
 *  Define a method to accept an integer value and return if the number is perfect else false.
 *  
 *  sum of individual factors of the number is equal to the number itself is known as perfect number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PerfectNumber {

	static boolean isPerfect(int n) {
		int sum = 0;
		for(int f = 1; f<= n/2 ;f++) {
			if(n%f == 0)
				sum+=f;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		System.out.println("Enter Number ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(isPerfect(n)?"Perfect Number":"not Perfect Number");
	}

}

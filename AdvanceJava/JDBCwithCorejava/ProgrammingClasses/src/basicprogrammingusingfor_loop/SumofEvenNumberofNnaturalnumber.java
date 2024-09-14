/*
 * Define a method to accept an integer value & return sum of even numbers of 'n' natural numbers
 */

package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class SumofEvenNumberofNnaturalnumber {

	public static int sum(int a) {
		int sum = 0;
		for(;a>0;a--) {
			if(a%2==0)
				sum+=a;
		}
		return sum;
			
	}
	public static void main(String[] args) {
		System.out.println("Enter a NUmber");
		int n = new Scanner(System.in).nextInt();
		System.out.println(sum(n));
	}

}

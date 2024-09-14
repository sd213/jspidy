/*
 *  Define a method to accept an integer value and return count  of factors & check whether the number is prime number based on count.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrimeNumberBasedOnCount {
	
	static int factor(int n) {
		if(n==1)
			return 0;
		int count = 0;
		for(int i = 1;i <=n;i++) {
			if(n%i==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.print("Enter n value : ");
		int n = new Scanner(System.in).nextInt();
		if(factor(n)==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}

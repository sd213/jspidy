/*
 *  Define a method to accept an integer value & return sum of factors of the number
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class SumOfFactors {


	static int sumOfFactors(int n) {
		if(n==1)
			System.out.println("Number is "+n +", So it does not have odd factors.");
		int sum= 0;
		for(int i = 1;i <=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
			
	}
	
	public static void main(String[] args) {
		System.out.println("Enter n value : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Sum of Factors: "+sumOfFactors(n));
	}
}

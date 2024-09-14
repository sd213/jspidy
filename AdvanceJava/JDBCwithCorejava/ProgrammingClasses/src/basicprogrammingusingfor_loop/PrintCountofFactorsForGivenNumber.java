/*
 * Define a method to accept integer value and return the count of factors for the given number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PrintCountofFactorsForGivenNumber {

	static int countFactor(int n) {
		int count = 0;
		for(int i = 1; i <=n ;i++) {
			if(n%i == 0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.print("Enter Num: ");
		System.out.println("Count of Factor : "+countFactor(new Scanner(System.in).nextInt()));
	}

}

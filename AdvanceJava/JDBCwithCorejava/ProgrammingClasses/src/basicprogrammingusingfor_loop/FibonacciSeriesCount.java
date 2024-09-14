/*
 * Write a java program to print count of fibonacci in given range.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class FibonacciSeriesCount {

	public static void main(String[] args) {
		
		System.out.print("Enter Start & End : ");
		int start = new Scanner(System.in).nextInt();
		int end = new Scanner(System.in).nextInt();
		int a = 0 , b = 1 , count = 0;
		for( ; a<= end ;){
			if(a>=start && a<=end)
				count++;
			int c = a+b;
			a = b;
			b = c;
		}
		System.out.println(count);

	}

}

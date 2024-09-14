/*
 *  Write a program to find fibonacci series in given range.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class FibonacciSeriesInRange {

	public static void main(String[] args) {
		System.out.println("Enter Starting & Ending Range:- ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int a = 0 , b = 1 , c= 0 ;
		for( ; a<= end; ) {
			if(a>= start && a<= end)
				System.out.println(a+"\t");
			c = a +b;
			a = b;
			b = c;
		}
	}

}

/**
	Write a Java Program to print even numbers in the range m to n.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class EvenNumberinRangeMtoN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter M : ");
		int m = sc.nextInt();
		System.out.print("Enter N:  ");
		int n = sc.nextInt();
		while(m <= n) {
			if(m%2==0) {
				System.out.println(m);
			}
			m++;
		}

	}

}

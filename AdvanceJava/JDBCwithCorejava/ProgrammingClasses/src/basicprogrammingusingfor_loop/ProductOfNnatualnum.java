/*
 * Define a method to accept an integer value & return product of 'n' natural number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class ProductOfNnatualnum {

	public static int multi(int n) {
		int multiall = 1;
		for(;n>1;n--)
			multiall*=n;
		return multiall;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number:-  ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(multi(n));
	}

}

/*
 * Define methods to get product of even numbers and product of odd numbers of given "n" natural number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class ProductofEvenandOddNaturalNum {

	public static int multiEven(int n) {
		int multiall = 1;
		for(;n>1;n--) {
			if(n%2==0)
				multiall*=n;
		}
		return multiall;
	}
	public static int multiOdd(int n) {
		int multiall = 1;
		for(;n>1;n--) {
			if(n%2!=0)
				multiall*=n;
		}return multiall;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number:-  ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Even Products:"+multiEven(n));
		System.out.println("Odd Products:"+multiOdd(n));
	}
	
}

/*
 * Define a method to accept integer value and return factorial of number
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static int factorial(int n) {
		int fact = 1;
		for(;n>1;n--) {
			fact = fact*n;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number:- ");
		System.out.println("Factorial of this Given Number is: "+ factorial(new Scanner(System.in).nextInt()));
	}

}

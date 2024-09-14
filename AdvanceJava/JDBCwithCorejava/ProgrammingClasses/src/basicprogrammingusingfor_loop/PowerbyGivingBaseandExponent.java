/*
 *  Define a method to accept base & exponential values & return Power
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class PowerbyGivingBaseandExponent {

	public static int pow(int base , int exp) {
		int power = 1;
		for( ;exp>0;exp--)
			power = power*base;
		return power;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Value :- ");
		int base = sc.nextInt();
		System.out.println("Enter Exp Value:- ");
		int exp = sc.nextInt();
		
		System.out.println("Power is :"+pow(base, exp));
	}

}

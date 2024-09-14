/**
	Define a method to print digits of a number greater than 4.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class PrintDigitsGre4 {
	
	public static int countOdd(int n) {
		int count = 0, rem = 0;
		while(n>0) {
			rem = n%10;
			n = n/10;
			if(rem>4) {
				System.out.println(rem);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.print("Enter Number: ");
		System.out.println("Greater than 4, digts list : "+ countOdd(new Scanner(System.in).nextInt()));
	}

}

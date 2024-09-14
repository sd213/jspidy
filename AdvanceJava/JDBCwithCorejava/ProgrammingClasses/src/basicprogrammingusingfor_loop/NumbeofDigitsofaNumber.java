/**
	Define a method to accept integer value and return count of digits
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */

public class NumbeofDigitsofaNumber {

	/**
	 * @param args
	 */
	public static int count(int integ) {
		
		int n = integ,count=0,rem=0;
		while(n>0) {
			rem = n%10;
			System.out.println(rem);
			n = n/10;
			count++;
		}
		return count;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num : ");
		System.out.println("Count :"+count(new Scanner(System.in).nextInt()));
		
	}

}

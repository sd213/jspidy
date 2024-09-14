/**
	Define a method to accept an integer value and print all even digits of the number.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class PrintEvenDigits {

	/**
	 * @param args
	 */
	public static int count(int integ) {
		
		int n = integ,count=0,rem=0;
		while(n>0) {
			rem = n%10;
			if(rem%2 == 0) {
				System.out.println(rem);
				count++;
			}
			n = n/10;
			
		}
		return count;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num : ");
		System.out.println("Even Number Count :"+count(new Scanner(System.in).nextInt()));

	}

}

/**
Define a method to accept an integer value & return reverse of the number .
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class ReverseOfNum2 {

	public static int rev2(int n) {
		String rev = "";
		while(n>0)
		{
			rev = rev + n%10;
			n = n/10;
		}
		return Integer.parseInt(rev);
		
	}
	public static void main(String[] args) {
		System.out.print("Enter A Number:- ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(rev2(n));
	}

}

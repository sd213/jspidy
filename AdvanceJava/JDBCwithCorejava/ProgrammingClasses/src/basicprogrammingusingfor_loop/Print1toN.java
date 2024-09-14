/**
	W.A.P to print numbers from 1 to N.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class Print1toN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:- ");
		int a = new Scanner(System.in).nextInt();
		for(int i = 1; i <= a ; i++) {
			System.out.println(i);
		}
	}

}

/**
	Define 2 methods to accept an integer value & return sum of 'N' Natural Numbers with BIGO(N) and also with BIGO(1) time complexity
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class SUMofN {

	public static int summation1BIGON(int n) {
		int sum = 0;
		for(;n>0;n--)
			sum+=n;
		return sum;
	}
	public static int summation2BIGO1(int n) {
		return (n*(n+1)/2);
	}
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Using BIGO(N): "+summation1BIGON(n));
		System.out.println("Using BIGO(1): "+summation2BIGO1(n));
		
	}

}

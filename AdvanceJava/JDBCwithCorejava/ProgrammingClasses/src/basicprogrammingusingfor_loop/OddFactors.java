/*
 *  Define a method to accept an integer value & return count of odd factors of the number
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class OddFactors {

	static void oddFactors(int n) {
		if(n==1)
			System.out.println("Number is "+n +", So it does not have odd factors.");
		
		for(int i = 2;i <n;i++) {
			if(n%i==0) {
				if(i%2!=0)
					System.out.println("Odd Factor: "+i);
			}
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("Enter n value : ");
		int n = new Scanner(System.in).nextInt();
		oddFactors(n);
	}
}

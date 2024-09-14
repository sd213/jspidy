/*
 *  Define a method to accept an integer value & print each & every digit's factors.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class EachandEveryDigitsFactors {

	static void printEachEveryDigitFactor(int n) {
		if(n==1)
			System.out.println("Number is "+n +", So it does not have Even factors.");
		else if (n>1) {
			while(n>0) {
				int rem = n%10;
				n = n/10;
				System.out.println("\tFactors of "+rem);
				if(rem==0)
					System.out.println("\t\tThis Factors "+rem +", So it does not have factors.");
				else if(rem==1)
					System.out.println("\t\tThis Factors "+rem +", So it does not have factors.");
				else {
					for(int i = 1;i <=rem;i++) {
						if(rem%i==0) {
							System.out.println("\t\t"+i);
						}
					}
				}
			}
				
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter Integer: ");
		printEachEveryDigitFactor(new Scanner(System.in).nextInt());
	}

}

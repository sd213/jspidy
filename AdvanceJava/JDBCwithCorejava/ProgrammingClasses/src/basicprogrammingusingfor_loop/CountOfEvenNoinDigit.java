/**
	Define a method to accept range of Integer & print count of even No. in the range.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class CountOfEvenNoinDigit {

	public static void countEven(int a , int b) {
		int count = 0;
		if(a<b) {
			while(a<b-1) {
				a++;
				if(a%2 == 0) {
					count++;
					System.out.println(a);
				}
				
			}
		} else {
			while(b<a-1) {
				b++;
				if(b%2 == 0) {
					count++;
					System.out.println(b);
				}
				
			}
		}
		System.out.println("Even digits Count: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers:- ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		countEven(a,b);
	}

}

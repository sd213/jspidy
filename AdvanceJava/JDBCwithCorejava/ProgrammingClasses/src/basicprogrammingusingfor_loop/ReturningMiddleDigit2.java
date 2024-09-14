/**
	
	Define a method to accept an integer value & return middle digit.
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class ReturningMiddleDigit2 {

	public static int count(int n) {
		int count = 0;
		while(n>0) {
			count ++;
			n/=10;
		}
		return count;
	}
	public static int middle(int pos,int n) {
		while(pos>0) {
			n/=10;
			pos--;
		}
		return n %10;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int count = count(n);
		if(count %2 ==1) {
			int pos = count / 2;
			int mid = middle(pos,n);
			System.out.println(n+" for middle digit is "+mid);
		}else {
			System.out.println("Invalid input");
		}
	}

}

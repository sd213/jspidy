
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class CountZeroinNumber {
	public static void count(int n) {
		int rem,count=0;
		while(n>0) {
			rem = n%10;
			if(rem==0)
				count++;
			n=n/10;
		}
		System.out.println("Zeroes in Number :  "+count);
	}
	public static void main(String[] args) {
		System.out.println("Enter Number :  ");
		count(new Scanner(System.in).nextInt());
	}
	

}

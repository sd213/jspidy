/*
 *  Define a method to accept an integer value & return second smallest digit in the given number.
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

public class SmallestdigitinNumber {

	public static int second(int n) {
		if(n>9) {
			int min1 = n%10;
			n/=10;
			int min2 = n%10;
			n/=10;
			if(min1 > min2) {
				int temp = min1;
				min1 = min2;
				min2 = temp;
			}
			while(n > 0) {
				int last = n%10;
				if(last < min1) {
					min2 = min1;
					min1 = last;
					
				}else if(last < min2) {
					min2 = last;
				}
				n/=10;
			}
			return min2;
		}
		else return -1;
	}
	public static void main(String[] args) {
		System.out.print("Enter a Num: ");
		int n = second(new Scanner(System.in).nextInt());
		if(n != -1) {
			System.out.println("Second Smallest in Num: "+ n);
		}else {
			System.out.println("No Second Smallest in Number");
		}
	}

}

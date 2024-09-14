/**
	Define a method to accept an integer value and return second digit in num
 * 
 */
package basicprogrammingusingfor_loop;

import java.util.Scanner;

/**
 * 
 */
public class SecondGreatestDigitinNum {

	public static int secondDigit(int n) {
		if(n>9) {
			int max1 = n%10;
			n/=10;
			int max2 = n%10;
			n/=10;
			//Swapping
			if(max1 < max2) {
				int temp = max1;
				max1 = max2;
				max2 = temp;
			}
			while(n>0) {
				int last = n%10;
				if(last > max1) {
					max2 = max1;
					max1 = last;
				}
				else if(last > max2) {
					max2 = last;
				}
				n /= 10;
			}
			return max2;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number:- ");
		int a = secondDigit(new Scanner(System.in).nextInt());
		if(a != -1) {
			System.out.println("Second Greatest Num is "+a );
		}
		else {
			System.out.println("There is no Second Num");
		}

	}

}

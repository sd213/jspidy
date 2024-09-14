//W.A.P to check whether the given number is equal or not without using == operator.
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class EqualWithoutEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		switch(a ^ 15) {
		case 0:
			System.out.println("Given number is equal to 15");
			break;
			default:
				System.out.println("Given number is not equal to 15");
		}

	}

}

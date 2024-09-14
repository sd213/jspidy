//W.A.J.P to check whether the given number is present in the range 65 to 79 or not if the number is present then print number is in range or number is not in range.

package basicprogrammingusingif_switch;

import java.util.Scanner;

public class InRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number ");
		int a = sc.nextInt();
		if( a>= 65 && a <= 79) {
			System.out.println("Number is in range");
		}else {
			System.out.println("Number is not in range");
		}
	}
}

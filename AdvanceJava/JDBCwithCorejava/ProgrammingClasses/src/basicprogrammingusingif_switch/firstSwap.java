// W.A.P to swap 2 numbers using 3rd variable
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class firstSwap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int temp , a = s.nextInt(),b = s.nextInt();
		System.out.println("before Swapping "+ a + "  "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after Swapping "+ a + "  " + b);
	}
}

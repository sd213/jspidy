//// W.A.P to swap 2 numbers without using 3rd variable
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class SecondSwap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println("before Swapping "+ a+ "  "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after Swapping "+ a + "  "+b);
	}
}

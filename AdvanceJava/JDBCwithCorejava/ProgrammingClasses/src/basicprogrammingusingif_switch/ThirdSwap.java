// Third way Swapping 2 variables using multiplication & division
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class ThirdSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt(),b = sc.nextInt();
		
		System.out.println("before Swapping "+ a + "  "+b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swapping "+ a + "  "+b);

	}

}

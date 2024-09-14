// W.A.J.P to find the second greatest number by using ternary operator in 2 numbers
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class SecondGreatestNumber {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = s.nextInt(),b = s.nextInt() ;
		int res = a>b?b:a;
		System.out.println(res + " is second greatest");
	}
}

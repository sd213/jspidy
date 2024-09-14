// W.A.J.P to find the greatest number by using ternary operator in 5 numbers
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class Greatest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		int a = s.nextInt(),b = s.nextInt() , c = s.nextInt() ,d = s.nextInt(), e = s.nextInt();
		int res = (a>b && a>c && a>d && a>e)? a:(b>c && b>d && b>e)?b:(c>d & c>e)? c:(d>e)?d:e;
		System.out.println(res + " is greatest");
	}
}

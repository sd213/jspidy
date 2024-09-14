// W.A.J.P to check whether given number is positive , negative or neutral
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class PositiveOrNegative2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String res = n>0? "positive":(n<0?"negative":"neutral");
		System.out.println(n +" is " + res);

	}

}

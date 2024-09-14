// W.A.J.P to check whether given number is positive or negative .
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println(a +" is positive");
		}else if(a<0) {
			System.out.println(a +" is negative");
		}else {
			System.out.println("zero");
		}
	}

}

// W.A.P to check whether the given character is uppercase or not using ASCII values.
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class UpperCaseOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character ");
		char c = sc.next().charAt(0);
		if(c>=65 && c<=90) {
			System.out.println(c +" is UpperCASE Character");
		}else {
			System.out.println(c +" is not UpperCase Character");
		}

	}

}

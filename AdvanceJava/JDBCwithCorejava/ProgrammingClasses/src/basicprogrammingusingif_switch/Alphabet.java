// W.A.P to check whether the given character is alphabet or not.=
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character ");
		char c = sc.next().charAt(0);
		if(c>='A'&& c <='Z' || c>='a' && c <='z') {
			System.out.println(c +" is alphabet");
		}else {
			System.out.println(c +" is not alphabet");
		}
	}
}

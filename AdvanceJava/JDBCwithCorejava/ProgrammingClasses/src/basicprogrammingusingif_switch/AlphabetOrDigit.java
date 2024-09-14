package basicprogrammingusingif_switch;
//W.A.P to check whether the given character is alphabet or digit.

import java.util.Scanner;

public class AlphabetOrDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character ");
		char c = sc.next().charAt(0);
		if(c>= 65 && c <= 90 || c>= 97 && c <= 122) {
			System.out.println(c +" is alphabet");
		}else if(c>=48 && c<=57) {
			System.out.println(c +" is digit");
		}else {
			System.out.println("It is a special character");
		}
	}

}

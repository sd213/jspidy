// W.A.J.P to find the smallest number in 4 numbers
package basicprogrammingusingif_switch;

import java.util.Scanner;

public class SmallestAmong4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 Numbers");
		int a = s.nextInt(),b = s.nextInt() , c = s.nextInt() ,d = s.nextInt();
		int res = (a<b && a<c && a<d)? a:(b<c && b<d)?b:(c<d)? c:d;
		System.out.println(res + " is smallest");
	}
}

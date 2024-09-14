/**
	Define a method to accept an integer value & return reverse of the number .
 * 
 */
package basicprogrammingusingfor_loop;


import java.util.Scanner;

/**
 * 
 */
public class ReverseOfNum {

	
	public static int rev1(int n) {
		int rev = 0;
		while(n>0) {
			int last = n%10;
			rev = rev * 10 + last;
			n/= 10;
		}
		return rev;
	}
	public static int rev2(int n) {
		String rev = "";
		while(n>0)
		{
			rev = rev + n%10;
			n = n/10;
		}
		return Integer.parseInt(rev);
		
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter A Number:- ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(rev1(n));
		System.out.println(rev2(n));
	}

}

/**
	W.A.J.P to convert given negative number to positive number.
 * 
 */
package basicprogrammingusingif_switch;

/**
 * 
 */
public class ConvertNegativeToPositive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any Number: ");
		double a = new java.util.Scanner(System.in).nextDouble();
		System.out.println(a);
		method1(a);
		method2(a);
	}	

	public static void method1(double a) {
		if(a<0)
			a*=-1;
		System.out.println(a);
	}
	public static void method2(double a) {
		double positiveNum = Math.abs(a);
		System.out.println(positiveNum);
	}
}

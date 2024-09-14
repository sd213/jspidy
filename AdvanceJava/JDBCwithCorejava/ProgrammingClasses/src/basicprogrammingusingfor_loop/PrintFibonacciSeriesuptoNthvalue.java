/*
    Write a java program to print fibonacci series upto nth value.
 */
package basicprogrammingusingfor_loop;
import java.util.Scanner;

public class PrintFibonacciSeriesuptoNthvalue {
    public static void main(String[] args) {
        System.out.println("Enter n value");
        int n = new Scanner(System.in).nextInt();
        int a = 0 , b =1 , c = 0;
        for(;a<=n;){
            System.out.print(a+" ,");
            c = a+b;
            a = b;
            b = c;
        }
    }
}

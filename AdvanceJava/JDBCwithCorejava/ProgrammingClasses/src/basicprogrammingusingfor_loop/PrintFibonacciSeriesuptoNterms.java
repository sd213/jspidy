package basicprogrammingusingfor_loop;
/*
    Write a java program to print fibonacci series upto 'n' terms.
 */
import java.util.Scanner;

public class PrintFibonacciSeriesuptoNterms {
    public static void main(String[] args) {
        System.out.println("Enter n value");
        int n = new Scanner(System.in).nextInt();
        int a = 0 , b = 1,c = 0;
        for(;n>0;n--){
            System.out.print(a);
            if(n>1){
                System.out.print(",");
            }
            c = a+b;
            a = b;
            b = c;
        }
    }
}

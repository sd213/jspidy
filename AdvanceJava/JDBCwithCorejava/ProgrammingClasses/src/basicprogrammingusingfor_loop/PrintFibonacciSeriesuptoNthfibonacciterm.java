package basicprogrammingusingfor_loop;
import java.util.Scanner;

public class PrintFibonacciSeriesuptoNthfibonacciterm {
    public static void main(String[]args){
        System.out.println("Enter n value ");
        int n = new Scanner(System.in).nextInt();
        int a = 0 , b = 1 , c = 0;
        for(; n>1;n--){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(a+",");
    }
}

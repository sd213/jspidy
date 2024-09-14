/*
    Write a java program to print alternate fibonacci series upto 'n' terms.

 */
package basicprogrammingusingfor_loop;
import java.util.Scanner;

public class AlternateFibonacci {
    public static void main(String[] args) {
        System.out.print("Enter N value ");
        int n = new Scanner(System.in).nextInt();
        int a = 0, b = 1 ,count = 0;
        for(;n>1;n--,count++){
            if(count %2 ==0){
                System.out.print(a);
                if(n>3){
                    System.out.print(",");
                }
            }
            int c = a+b;
            a = b;
            b = c ;
        }
    }
}

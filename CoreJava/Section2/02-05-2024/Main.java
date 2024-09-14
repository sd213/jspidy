import java.util.*;
public class Main {
    public static void printOptions1(){
        System.out.println("#######################");
        System.out.println("Enter Options");
        System.out.println("#######################");
        System.out.println("1. AddBall()");
        System.out.println("2. RemoveBall()");
        System.out.println("3. display()");
        System.out.println("0. exit");
        System.out.println("#######################");
        System.out.print("Input: ");
        System.out.println("");
       
    }

    public static void chooseOption(){
        int choice = 100;
        Scanner sc1 = new Scanner(System.in) ;
        Bag bag1 = new Bag(20500);
        while(choice != 0){
            printOptions1();
            choice = sc1.nextInt();
            switch(choice){
                case 1:

					choice = bag1.AddBall();
                    break;
                case 2:
					choice = bag1.RemoveBall();

                    break;
                
				case 3:
                    bag1.display();
                    break;
                    
				case 0:
                    choice = 0;
                    break;
                
				default:
                        System.out.println("Invalid input");
                }

		}
    }
    public static void main(String[]args)
    {

        chooseOption();


    }
}

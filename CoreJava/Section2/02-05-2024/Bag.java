import java.util.*;

public class Bag
{
    private double capacity;
    private static int haveTennisBalls;
    private  static  int haveBasketBalls;

    Bag(int capacity){
        this.capacity = capacity;
        System.out.println("bag has  capacity of volume " + capacity + "cm 3" );
    }
    public static void printOptions2(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("################");
        System.out.println("Enter Options to Print:");
        System.out.println("1. BasketBall");
        System.out.println("2. TennisBall");
        System.out.println("0. Go back to Main Menu");
        System.out.println("100. to Exit from program");
        System.out.println("###");
        System.out.print("Input: ");
        
    }
	
    public static  boolean verify(Bag bag1){
        Ball b01 = new BasketBall();
        Ball b02 = new TennisBall();
        
        double basketballvolm = b01.volumeCalculator();
        double tennisballvolm = b02.volumeCalculator();
        // System.out.println("Basket Ball Volume : "+ basketballvolm);

        // System.out.println("Tennis Ball Volume : "+ tennisballvolm);

        double totalBasketVolume = basketballvolm* haveBasketBalls;

        double totalTennisVolume = tennisballvolm* haveTennisBalls;
        double remainingSpaceinBag = bag1.capacity - (totalBasketVolume +totalTennisVolume);
        if(bag1.capacity< (tennisballvolm * (haveTennisBalls)) + (basketballvolm* (haveBasketBalls))){
        
            return false;
        }
        else{
            System.out.println("bags Remaining Capacity: "+remainingSpaceinBag +"\nTotalBasketBall Volume: " + totalBasketVolume
                    + " , \nTotalTennis Ball Volume : " + totalTennisVolume);
            //totalBasketVolume;
            return true;
        }
    }
	// public static  boolean verify2(Bag bag1){
        // Ball b01 = new BasketBall();
        // Ball b02 = new TennisBall();
        
        // double basketballvolm = b01.volumeCalculator();
        // double tennisballvolm = b02.volumeCalculator();
      //  System.out.println("Basket Ball Volume : "+ basketballvolm);

      //  System.out.println("Tennis Ball Volume : "+ tennisballvolm);

        // double totalBasketVolume = basketballvolm* haveBasketBalls;

        // double totalTennisVolume = tennisballvolm* haveTennisBalls;
        // double remainingSpaceinBag = bag1.capacity - (totalBasketVolume +totalTennisVolume);
        // if(bag1.capacity< (tennisballvolm * (haveTennisBalls)) + (basketballvolm* (haveBasketBalls))){
        
            // return false;
        // }
        // else{
            // System.out.println("bags Remaining Capacity: "+remainingSpaceinBag +"\nTotalBasketBall Volume: " + totalBasketVolume
                    // + " , \nTotalTennis Ball Volume : " + totalTennisVolume);
            //totalBasketVolume;
            // return true;
        // }
    // }
	
    public int AddBall(){
        int choice0 = 100;
        int choice1 = 200;
        Ball b1;
        Scanner sc2 = new Scanner(System.in);
        while(choice1 != 100){
                printOptions2();
                choice1 = sc2.nextInt();
                switch (choice1){
                    case 1:
                        b1 = new BasketBall();
						haveBasketBalls++;
                        System.out.println("Basket Ball Radius : "+b1.getRadius());
                        if(verify(this)){
                            System.out.println("Added BasketBall to Bag");
                        }
                        else {
                            System.out.println(" Can not be added More ");
							haveBasketBalls--;
                        }
                        break;
                    case 2:
                        b1 = new TennisBall();
                        haveTennisBalls++;
                        System.out.println("Tennis Ball Radius : " + b1.getRadius());
                        if(verify(this)){
                            System.out.println("Added TennisBall to Bag");
                        }
                        else { 
                            System.out.println(" Can not be added More ");haveTennisBalls--;
                        }
                        break;
                    case 0:
                        choice1 = 100;
                        break;
                    case 100:
                        choice1 = 100;
                        choice0 = 0;
                        break;
                    default:
                        
                        System.out.println("Entered Invalid Input");
                        break;
                }
                     
        }
        
       return choice0;
    }


    
    public int RemoveBall(){
		int choice0 = 100;
        int choice1 = 200;
        Ball b1;
        Scanner sc3 = new Scanner(System.in);
        while(choice1 != 100){
                printOptions2();
                choice1 = sc3.nextInt();
                switch (choice1){
                    case 1:
                        b1 = new BasketBall();
						
                        System.out.println("Basket Ball Radius : "+b1.getRadius());
                        if(haveBasketBalls>0){
							haveBasketBalls-- ;
                            System.out.println("Removed BasketBall from Bag");
                        }
                        else {
                            System.out.println(" Can not be removed BasketBall More ");
                        }
                        break;
                    case 2:
                        b1 = new TennisBall();
                        
                        System.out.println("Tennis Ball Radius : " + b1.getRadius());
                        if(haveTennisBalls>0){
							haveTennisBalls--;
                            System.out.println("Removed TennisBall from Bag");
                        }
                        else { 
                            System.out.println(" Can not be remove TennisBall More ");
							
                        }
                        break;
                    case 0:
                        choice1 = 100;
                        break;
                    case 100:
                        choice1 = 100;
                        choice0 = 0;
                        break;
                    default:
                        
                        System.out.println("Entered Invalid Input");
                        break;
                }
                     
        }
        
       return choice0;

    }
    public void display(){
        System.out.println("Game can be played with " + ((haveTennisBalls >0) ? ((haveBasketBalls>0 )? haveTennisBalls + "Tennis Balls and "+ haveBasketBalls + " Basket Balls ": haveTennisBalls + "Tennis Balls "): ((haveBasketBalls>0 )? haveBasketBalls + " Basket Balls ":  "No Balls ") ));
    }
}
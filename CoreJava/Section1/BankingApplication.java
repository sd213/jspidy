import java.util.Scanner;

class BankingApplication
{
   static double balance=1000;
   
  public static double  checkBalance()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("-----------------------$$$--------------------");
   System.out.println("Your Balance is:"+balance);
   System.out.println("-----------------------$$$--------------------");
   System.out.println("-----------------------$$$--------------------");
   return balance;
   }
   public static double withdraw()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Amount");
     double withdraw=sc.nextDouble();
     

     if(withdraw<balance){
     System.out.println("WITHDRAW SUCCES");
     balance-=withdraw;
     System.out.println("Remainng Balance:"+balance);
     System.out.println("DO YOU WANT TO CHECK REMAINING BALANCE");
     int yes=sc.nextInt();
     
            if(yes==1){
            System.out.println("youe balance is"+balance);
             }
             else{
            System.out.println("THANK YOU");
            }

      }
       else{
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
       System.out.println("INVALID AMOUNT");
       System.out.println("---------------------------");
       System.out.println("---------------------------");
       System.out.println("---------------------------");
       }
       return balance;

   
   }
   public static double deposit(){
    Scanner sc=new Scanner(System.in);
   System.out.println("ENTER AMOUNT TO BE DEPOSIT");
   double deposit=sc.nextDouble();
   balance +=deposit;
   System.out.println("The AMOUNT"+deposit+ "TO BE DEPOSITED SUCCESFULLY");
   return balance;



   }
   

   public static void main(String[] args)
   {
    int i=0;
      while(i==0)
      {
     System.out.println("*****************************************************************");
     System.out.println("welcome to BANK Application");
     System.out.println("*****************************************************************");
     System.out.println("1:Check Balance");
     System.out.println(" 2:Withdraw Cash");
     System.out.println(" 3:Deposit Cash");
     System.out.println(" 4: Exit");
     System.out.println("*****************************************************************");
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Enter Your Choice:-");
     int choice=sc.nextInt();
      
     if(choice==1)
     {
     System.out.println("you chosen check balance");
     
     System.out.println(checkBalance());
     
     }
      else if(choice==2){
     System.out.println("you chosen withdraw");
     System.out.println( withdraw());
     

     
      }
      if(choice==3)
     {
     System.out.println("you chosen deposit");
     deposit();
     System.out.println("DO U WANT CHECK AMOUNT");
     
     System.out.println("THE TOTAL AMOUNTIS:"+balance);
     

     System.out.println(withdraw());

     
     }
      else{
     i=0;
     System.out.println("");
      }

    
    }

  }
}

     
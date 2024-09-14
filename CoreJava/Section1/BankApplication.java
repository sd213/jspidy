// Create a class with name banking application
import java.util.Scanner;
public class BankApplication{
		//double static balance = 1000;
	static double balance = 1000;
	static int count = 0;
	
	public static void main(String[] args){
		
		choice();
		
	}
	public static void checkBalance(){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("###############checkBalance#####################");
		System.out.println();
		System.out.println();
		
		System.out.println("###### Balance: " + balance + "#############");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public static void withdrawCash(){
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("###### Available Balance: " + balance + "#############");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("############ Enter Money To Withdraw #########: ");
		Scanner sc = new Scanner(System.in);
		double withdraw = sc.nextDouble();
		if(withdraw <= balance){
			balance -= withdraw;
			System.out.println();
			System.out.println();
			System.out.println("@@@@@@@@@@ Withdraw Was Successful @@@@@@@@");
			System.out.println();
			System.out.print("#####Do you want to Display Balance#######\n Enter- (yes/n) : ");
			sc.nextLine();
			String options = sc.nextLine();
			
			switch(options.charAt(0)){
				case 'Y','y' -> { checkBalance(); break;}
				default -> {System.out.println("Okay Good Bye");}
			};
		
		}
		else{
			System.out.println();
			System.out.println();
			System.out.println("##### Withdraw amount can not be greater than balance #######");
			System.out.println();
			System.out.println();
			System.out.print("#####Do you want to Display Balance#######\n Enter- (yes/n) : ");
			sc.nextLine();
			String options = sc.nextLine();
			
			switch(options.charAt(0)){
				case 'Y','y' -> { checkBalance(); break;}
			};
			
		}
	
	}
	public static void depositCash(){
		System.out.print("############ Enter Money To Deposit : ");
		Scanner sc = new Scanner(System.in);
		double deposit = sc.nextDouble();
		if(deposit > 0){
			balance += deposit;
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("@@@@@@@@@@ Deposition Was Successful @@@@@@@@");
			System.out.println();
			System.out.println("###### Now Available Balance: " + balance + "#############");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		else{
			System.out.println();
			System.out.println();
			System.out.println("##### Deposit amount can not be less than 0 #######");
			System.out.println();
			System.out.println();
		}
	}
	
	public static void choice(){
		
		while(count!=4){
			System.out.println("###############################################");
		
			System.out.println();
			System.out.println("  Welcome To MY BANK : ");
			System.out.println("  Here are Options To try : ");	
			System.out.println();
		
			System.out.println("		1.Check Balance : ");
			System.out.println("		2.Withdraw  Cash : ");
			System.out.println("		3.Deposit  Cash : ");
			System.out.println("		4.Exit  : ");
		
			System.out.println();
			System.out.println();
			System.out.println("###############################################");
			System.out.println();
			System.out.println();
			System.out.print("##### ENTER YOUR OPTIONS : ");
		
			Scanner sc = new Scanner(System.in);
			count = sc.nextInt();
			
			switch(count){
				case 1:
						checkBalance();
						break;
				case 2:
						withdrawCash();
						break;
				case 3:
						depositCash();
						break;
					
				case 4: 
						count = 4;
						System.out.println("Thanks For Using Application :)");
						//System.exit(0);
						break;
				default:
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println(" !#$#!@! Invalid Output !@#!@! "); 
						System.out.println();
						System.out.println();
						System.out.println();
			}
		
		}
	}
	
}
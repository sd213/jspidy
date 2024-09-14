import java.util.Scanner;
public class MAIN
{
    public static void chooseOptions1(ATM bank, int var){
		ATM bank01 = bank;
		int choice = 100;
		double amount;
		Scanner sc = new Scanner(System.in);
		// if(var == 1){
		// 	HDFC bank01 = (HDFC) bank;
		// }
		// else if(var == 2){
		// 	ICICI bank01 = (ICICI) bank;
		// }
		// else if(var == 3){
		// 	SBI bank01 = (SBI) bank;
		// }
		// else{
		// 	ATM bank01 = bank;
		// }
		while(choice != 0){
			
            
		    System.out.println("##################");
		    System.out.println("1. Withdraw()");
		    System.out.println("2. CheckBalance()");
		    System.out.println("3. deposit(amount)");
            System.out.println("0. go Back ");
			System.out.println("###################");
			choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("");
				System.out.print("Enter the Withdraw amount: ");
				System.out.println("");
				amount = sc.nextDouble();
				bank01.withdraw(amount);
				break;
			case 2:
				System.out.println("");
				System.out.println("Checking the details");
				System.out.println("");
				bank01.checkBalance();

				break;
			case 3:
				System.out.println("");
				System.out.print("Enter the Deposit the amount: ");
				System.out.println("");
				amount = sc.nextDouble();
				bank01.deposit(amount);
				break;
			
			case 0:
				choice = 0;
				break;

			default:
				System.out.println("Invalid Input");
			}

		}
	}
    public static void main(String[]args){

		int options = 100;
		ATM a1;
		Scanner sc = new Scanner(System.in);
		while (options != 0) {
			System.out.println("Enter The Bank Name");
			System.out.println("#########Banks");
        	System.out.println("##############");
			System.out.println("1. HDFC");
			System.out.println("2. ICICI");
			System.out.println("3. SBI");
			System.out.println("0. exit");
			System.out.println("##############");
			System.out.println("         ");
			System.out.print("Input Options: ");
			options = sc.nextInt();
			switch (options) {
				case 1:
					a1 = new HDFC();
					System.out.println("Enter Options  for HDFC BANK");
					chooseOptions1(a1,1);
					break;
				
				case 2:
					a1 = new ICICI();
					System.out.println("Enter Options  for ICICI BANK");
					chooseOptions1(a1,2);
					break;

				case 3:
					a1 = new SBI();
					System.out.println("Enter Options  for SBI BANK");
					chooseOptions1(a1,3);
					break;

				case 0:
					options = 0;
					break;
				default:
					System.out.println("Invalid Input");

					
			}
		}
		
    }
}
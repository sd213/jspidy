package com.mobile;

public class ShopOwner {
	
	public static SimCard   buyingSim() {
		SimCard s1=null;
		String phno1;
		String input = null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("\n\nSo You Choose to Use Sim:- ");
		System.out.println("\n\nBuying A Sim For You\n\n");
		while(s1 == null) {
			System.out.print("Enter 10 digit PhoneNumber to get Sim:- ");
			phno1 = sc.next();
			s1 = new SimCard(phno1);
			if(s1.getPhoneNumber()== null) {
				s1 = null;
			}
		}
		System.out.println("You have Bought Sim with Phone Number "+s1.getPhoneNumber());
		
		while(input !="0") {
			System.out.println("Do You Want to Activate the Sim \n 		Yes.	No.		Exit.");
			System.out.print("Enter Input:- ");
			input = sc.next().toUpperCase();
			switch(input) {
			
			case "YES":
				s1.Activate();
				input = "0";
				break;
				
			case "NO":
				s1.Deactivate();
				input = "0";
				break;
				
			case "EXIT":
				input = "0";
				System.out.println("Exiting From Activation");
				break;
			default:
				System.out.println("\n\n@@@@@@Invalid Input@@@@@@\n\n");
			}
		}
		
		return s1;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=100;
		SimCard sim1;
		MobilePhone m1;
		String phno2,brand1,model1;
		String input2 = null;
		System.out.println("\n\n---------Enter To My Mobile Mart---------\n\n");
		while(choice!=0) {
			System.out.print("What Do You Want to Buy:-\n		1. Sim\n		2. Mobile\n		0. Exit Shop\n	Enter Option:-	 ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			choice = sc.nextInt();
		
			switch(choice) {
					
				case 1:	
						sim1 = buyingSim();
						
						break;	
					
				case 2:
						System.out.println("\n\n You Chose to Buy to Phone");
						System.out.print("Enter Mobile Brand:- ");
						brand1 = sc.next();
						System.out.print("Enter Mobile Model:- ");
						model1 = sc.next();
						m1 = new MobilePhone(brand1, model1);
						
						while(input2 !="0") {
							System.out.println("Do You Want Sim \n 	(	Yes.	No.  )\n");
							System.out.print("Enter Input:- ");
							input2 = sc.next().toUpperCase();
							switch(input2) {
							
							case "YES":
								sim1 = buyingSim();
								m1.insertSimCard(sim1);
								input2 = "0";
								break;
								
							case "NO":
								sim1 = null;
								input2 = "0";
								break;
			
							default:
								System.out.println("Invalid Input");
							}
						}
						input2 = null;
						int option = 10;
						while(option != 0)
						{
							System.out.println("### Options for Mobile: -");
							System.out.print("\n\n	1. Make a Call\n	2. Display Phone Info\n		0. EXIT\n	Enter Input:- ");
							option = sc.nextInt();
							
							switch(option) {
							case 1:
								System.out.println("Which Number You Want to Call :- ");
								phno2 = sc.next();
								m1.makeCall(phno2);
								break;
							case 2:
								System.out.println("Display Phone Info ");
								m1.displayPhoneInfo();
								break;
							case 0:
								option = 0;
								break;
							default:
								System.out.println("Invalid Option");
							}
						}
						break;
						
					
				case 0:
						System.out.println("\n\n--------------Thanks For Visiting Our Store .--------------\n\n");
						choice = 0;
						break;
				default:	
						System.out.println("@@@@@@@Invalid Option. Try Again @@@@@@@");
						
			}
			
		}
	}

}

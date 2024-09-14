package com.exceptions.IITException_pack;

import java.util.Scanner;

public class IITJEE_Exam {
    public static void dataValidation(double percentile, String Cast) throws ReservationException {
        switch(Cast){
            case "GENERAL":
                if(percentile > 90){
                    System.out.println("Ellgible For IIT");
                }else{
                    throw new ReservationException("Sorry Reservation Problem with General. Work Hard");
                }
                break;
            case "OBC":
                if(percentile > 70){
                    System.out.println("Ellgible For IIT");
                }else{
                    throw new ReservationException("Sorry Reservation Problem with OBC. Work Hard");
                }
                break;
            case "SC":
            case "ST":
                if(percentile > 50){
                    System.out.println("Ellgible For IIT");
                }else{
                    throw new ReservationException("You Should Work Hard to get More than 50");
                }
                break;
            default:
                throw  new ReservationException(" Unknown Cast");
                
        }

    }

    public static void main(String[] args) throws ReservationException {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Percentage:- ");
        double perCent = sc.nextDouble();
        int c = 1;
        String cast = null;
//        while(c!=0) {
            System.out.print("Enter Your Cast\n1. General\n2. OBC\n3. SC/ST \n input:- ");
            cast = sc.next().toUpperCase();
//            switch (cast){
//                case "GENERAL":
//                    System.out.println("So You Belong to General Cast");
//                    c = 0;
//                    break;
//                case "OBC":
//                    System.out.println("So You Belong to OBC Cast");
//                    c = 0;
//                    break;
//                case "SC":
//                case "ST":
//                    System.out.println("So You are from either SC or ST class");
//                    c = 0;
//                    break;
//                default:
//                    System.out.println("Invalid Input");
//            }
//        }
        dataValidation(perCent,cast);

    }
}

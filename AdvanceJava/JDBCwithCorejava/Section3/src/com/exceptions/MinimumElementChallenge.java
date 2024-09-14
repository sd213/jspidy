package com.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {

        System.out.println("Enter Number by Comma Separated :- ");
        String[] s = new String[]{String.join(",",new Scanner(System.in).nextLine())};
        System.out.println(Arrays.toString(s));
    }
//    public static int[] readIntegers(String ... str){
//
//    }

}

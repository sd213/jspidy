package com.exceptions;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][]  array1 = new int[4][4];
        array1[0] = new int[]{10,20,30};

        System.out.println(Arrays.deepToString((Object[]) array1 ));
        Integer[][] array2 = new Integer[4][4];
        array2[0] = new Integer[] {10,20,30};
        
        String[]  str = {"helloWorld","joker"};
        System.out.println(Arrays.deepToString((Object[]) array2 ));


    }
}

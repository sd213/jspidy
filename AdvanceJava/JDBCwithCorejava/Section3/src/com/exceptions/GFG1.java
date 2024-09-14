package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GFG1 {

    public static void main(String[] args)
    {

        // Reading file from path in local directory
        FileReader file = null;
        try {
            file = new FileReader("D:\\a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) {
            try {
                System.out.println(fileInput.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // Closing file connections
        // using close() method
        try {
            fileInput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.exceptions;
import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\a.txt");
        f.createNewFile();
        System.out.println("File Created Successfully");
    }
}

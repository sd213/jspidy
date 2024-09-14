package com.fileHandling.project.javaExcelIntegration;


import java.io.*;
import java.util.Scanner;

public class Jcsv {

//    ArrayList<String> a = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        boolean count = true;
        while(count){
            System.out.print("Enter Choice:- \n\n     1. Add Data \n     2. Print Data\n     0. Exit\n\nOptions:-- ");
            switch(new Scanner(System.in).nextInt()){
                case 1:
                        addData();
                        break;
                case 2:
                        retrieveData();
                        break;
                case 0:
                        count = false;
                        break;
                default:
                        break;
            }
        }
    }
    public static void addData() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FileName:- ");
        String fileName = sc.nextLine();

        File f = new File(".\\"+fileName+".csv");
//        File f = new File("C:\\Users\\somit\\OneDrive\\Desktop\\"+fileName+".csv");


        FileWriter fw = new FileWriter(f,true);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("\nWriting To file "+fileName+".csv");
        System.out.print("Enter Data:- ");
        String data = sc.nextLine();
        pw.println(data);
        pw.close();
    }

    public static void retrieveData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FileName:- ");
        String fileName = sc.next();
        File f = new File(".\\"+fileName+".csv");
//        File f = new File("C:\\Users\\somit\\OneDrive\\Desktop\\"+fileName+".csv");
        try(FileReader fr = new FileReader(f)) {
            int i;
            System.out.println("\nReading From a file "+fileName+".csv\n");
            while ((i = fr.read()) != -1)
                System.out.print((char)i);
            System.out.println("\n\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

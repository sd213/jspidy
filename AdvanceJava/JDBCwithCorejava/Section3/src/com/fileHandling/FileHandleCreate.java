package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandleCreate {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Downloads\\somitdas.txt");
		File f2 = new File("C:\\a.txt");
		File f3 = new File("C:\\Downloads\\sd.txt");
			if(f1.exists()) {
				System.out.println("File Already Exist");
			}
			else {
				if(f1.createNewFile()) {
					System.out.println("File Successfully Created");
				}
				else {
					System.out.println("File Already Exist");
				}
			}
			
		System.out.println("File Details");

		System.out.println("Absolute Path :"+f1.getAbsolutePath());
		System.out.println("Canonical Path :"+f1.getCanonicalPath());
		System.out.println("Free Space :"+f1.getFreeSpace());
		System.out.println("File Name :"+f1.getName());
		System.out.println("Get Parent:"+f1.getParent());
		System.out.println("Path :"+f1.getPath());
		System.out.println("FreeSpace :"+f1.getFreeSpace());
		System.out.println("Absolute File :"+f1.getAbsoluteFile());
		System.out.println("Get Usable Space :"+f1.getUsableSpace());

		System.out.println("Rename to :"+f1.renameTo(f2));
		System.out.println("Rename to :"+f1.renameTo(f3));

		System.out.println("Can Read :"+f1.getTotalSpace());
		System.out.println("Can Execute :"+ f1.canExecute());
		System.out.println("Can Read :"+f1.canRead());
		System.out.println("Can Write :"+f1.canWrite());
	}
	
		
}



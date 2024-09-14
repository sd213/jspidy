package demo2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Registering Data");
		String fname= req.getParameter("fname");
		String lname = req.getParameter("lname");
		System.out.println("Registering "+fname+" "+lname);
		String place = req.getParameter("place");
		String email = req.getParameter("email");
		String phonnum = req.getParameter("phonnum");
		StringBuilder pass1 = new StringBuilder(req.getParameter("pass1"));
		StringBuilder pass2 = new StringBuilder(req.getParameter("pass2"));
		Boolean succesful;
		if(pass1.compareTo(pass2)==0) {
			System.out.println("Password  Equal");
			succesful = true;
		}else succesful = false;
		String mesg = succesful ? "Succesful":"Not Successful";
		PrintWriter pw = res.getWriter();
//		pw.write("<html>"
//				+ "<head>"
//				+ "</head>"
//				+ "<body style='min-height:100vh;background-color:#07ffe6;display:flex;justify-content:center;align-items:center;flex-direction:column;'>"
//				+ "<div>"
//				+ "</div>"
//				+ "<p>"
//				+ "Name:- "+fname+ " "+ lname+" ,  Place:- "+place+" ,  Email :- "+email+" ,  Phone Number :- "+phonnum +" ,"
//				+ "</p>"
//				+ "<div>"
//				+ "<p>"
//				+ " status:- "+mesg
//				+ "</p>"
//				
//				+ "</div>"
//				
//				+ "</body>"
//				+ "</html>");
		
		
		File f = new File("C:\\Users\\somit\\eclipse-workspace\\Home.html");
		FileReader fr = new FileReader(f);
		String s = "";
		
		int i = fr.read();
		while(i!=-1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s = s+(char)i;
			System.out.println((char)i);
			i = fr.read();
		}
		pw.write(s);
	}

}

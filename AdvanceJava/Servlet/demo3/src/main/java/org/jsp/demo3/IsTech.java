package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsTech extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
			String mesg;
			n = Integer.parseInt(req.getParameter("num"));  
			//assign the value of n into num  
			num = n;  
			//the loop executes until the condition returns false  
			while (num > 0)  
			{  
				//incerements the variable digits by 1      
				digits++;  
				//removes the last digit of the given number  
				num = num / 10;  
			}  
			//check if the given number has an even number of digits or not  
			if (digits % 2 == 0)  
			{  
				num = n;  
				//determines the first half of the given number  
				firstHalf = num % (int) Math.pow(10, digits / 2);  
				//determines the second half of the given number  
				secondHalf = num / (int) Math.pow(10, digits / 2);  
				//calculate the square of both the numbers  
				squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
				//compares the square of the sum with the given number  
				
				if (n == squareOfSum)  
				{  
					mesg = n+" is a tech number.";  
				}  
				else  
				{  
					mesg = n+" is not a tech number.";  
				}  
			}  
			else  
			{  
				mesg = n+ " is not a tech number.";  
			}  
			
			PrintWriter pw = resp.getWriter();
	        pw.write("<html><body><h1 style='text-align:center'>"+mesg+"</h1></body></html>");
		
	}
	

}

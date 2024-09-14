package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsSpy  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int product = 1, sum = 0, rem; 
        Integer orginal = Integer.parseInt(req.getParameter("num")); 
        int n = orginal;
        // calculate sum and product of the number here. 
        while (n > 0) { 
            rem = n % 10; 
            sum = sum + rem; 
            product = product * rem; 
            n = n / 10; 
        } 
        System.out.println(product+", "+sum);
        // compare the sum and product. 
        String mesg="";
        if (sum == product) 
            mesg= "Given number "+orginal+" is spy number"; 
        else
            mesg= "Given number "+orginal+" is not spy number"; 
        
        PrintWriter pw = resp.getWriter();
        pw.write("<html><body><h1 style='text-align:center'>"+mesg+"</h1></body></html>");
	}
}

package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IsPrime extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer num = Integer.parseInt(req.getParameter("num"));
		System.out.println(num);
		PrintWriter pw = res.getWriter();
		String mesg = "";
//		int count = 1;
//		pw.write("Your Num "+ num);
		if(num <= 1) {
			mesg="Not Prime Nor Compound";
		}else if (num >1) {
			mesg="Prime";
			for(int a = 2 ; a < num;a++) {
				
				if(num %a==0) {
					mesg = "Compound";
					break;
				}
				
			}
		}else {
			mesg = "Prime";
		}
		pw.write("<html><body><h1 style='text-align:center'>"+num+" is "+mesg+"</h1><html><body>");
	}

}

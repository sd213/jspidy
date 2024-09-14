package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/FirstHTtpServlet")
public class FirstHTTpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("Click Class DoGet()...");
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body style='background-color:cyan'><h1 style='text-align:center'>Class HTTP SERVLET WITH out modifying web.xml and you click as get request <h1>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		System.out.println("Click class doPost()....");
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body style='background-color:#0000d2'><h1 style='text-align:center'>Class HTTP SERVLET WITH out modifying web.xml AND YOU CLICK AS POST REQUEST <h1>");
		
		
	}
}

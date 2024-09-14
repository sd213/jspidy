package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ThirdHTtpServlet")
public class ThirdHttpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Click Class DoPost()...");
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body style='background-color:cyan'><h1 style='text-align:center'>Class HTTP SERVLET WITH out modifying web.xml and you click AS Get Request <h1>");
	
	}
}

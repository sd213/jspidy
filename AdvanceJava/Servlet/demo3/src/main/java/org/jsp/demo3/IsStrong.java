package org.jsp.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsStrong extends HttpServlet{
	
	static int f[] = new int[10];
	  
    // Fills factorials of digits from 0 to 9.
    static void preCompute()
    {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }
     
    // Returns true if x is Strong
    static boolean isStrong(int x)
    {
        int factSum = 0;
      
        // Traverse through all digits of x.
        int temp = x;
        while (temp>0)
        {
            factSum += f[temp%10];
            temp /= 10;
        }
      
        return (factSum == x);
    }
     
//    // main function 
//    public static void main (String[] args) 
//    {   
//       }
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		 // calling preCompute
        preCompute();
        
        int x = Integer.parseInt(req.getParameter("num"));
        String mesg="";
        if(isStrong(x))
        {
            mesg="is a Strong Num";
        }
        else
            mesg="is not a Strong Num";
             
       
        PrintWriter pw = resp.getWriter();
        pw.write("<html><body><h1 style='text-align:center'>"+x+" "+mesg+"</h1></body></html>");
	}

}

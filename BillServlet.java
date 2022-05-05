package com.nt.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;

public class BillServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		//General seting 
		PrintWriter pw=null;
		res.setContentType("text/html");
		//read data from 
		try {
		String name=null;
		float price=0.0f;
		float qty=0.0f;
		name=req.getParameter("t1");
		price=Float.parseFloat(req.getParameter("t2"));
		qty=Float.parseFloat(req.getParameter("t3"));
		//calculate bill amount 
		float bamount=price*qty;
		if(bamount>=50000)
			System.out.println("Befour res.sendRDA()");
		else
			pw.println("<br>Form BillServlet Component<br>");

		pw.println("<br>Iteam name "+name+"price"+price+" qty"+qty+"BillAmount "+bamount+"<br>");
		//close stream 
		}catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		pw.close();
	}//end method

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}//end of the method 

}//end of the class

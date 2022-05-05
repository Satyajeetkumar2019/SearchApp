package com.nt.Servlet;

import javax.servlet.RequestDispatcher;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
	//general seting 
		PrintWriter pw=null;
		res.setContentType("text/html");
		//create variable 
		String ss=null;
		String engine=null;
		String url=null;
		//red from data 
		ss=req.getParameter("ss");
		engine=req.getParameter("engine");
		//prepare url with queary String From senddireaction 
		if(engine.equals("google"))
			url="https://www.google.co.in/search?q"+ss;
		else if(engine.equals("bing"))
			url="https://www.bing.co.in/search?q"+ss;
		else if(engine.equals("yahoo"))
			url="https://www.yahoo.co.in/search?q"+ss;
		System.out.println("Before SearchServlet ");
		res.sendRedirect(url);
		//RequestDispatcher rd=req.getRequestDispatcher();
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
		System.out.println("After  SearchServlet ");	
	}//end of the method 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}//end of the method 

}//end of the class

package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		
		int k = i+j;	
		
		
		//cookie  
		Cookie cookie = new Cookie("k",k+ "");
		res.addCookie(cookie);
		
		
		
//		//http session management - provided by tomcat server 
//		HttpSession session = req.getSession(); 
//		session.setAttribute("k", k);
		
//		PrintWriter out=  res.getWriter();
//		out.println("Result is : "+ k);
		
		//session management
//		req.setAttribute("k",k);  // passing key, and object which will be referenced by SqServlet 
		
		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k); //url re-writing
//	
//		//req dispatcher method 		
//		RequestDispatcher rd= req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		
		
		
	}

}

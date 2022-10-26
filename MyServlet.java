package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		out.println("HI this is Muzamil \n You are in MyServlet");
		
		//servlet context 
		
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		String phone = context.getInitParameter("phone");
		out.println(name+ ":"+ phone);
		
	
		
	}

}

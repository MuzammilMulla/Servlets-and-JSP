package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k =0;
		//cookie from other servlet
		Cookie cookies[] = req.getCookies(); 
		//all the cookies from the servlet are sent to this servlet. Current servlet has to decide
		// which cookie it needs, cookies are stored in an array which can be accessed using loops.
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) { //if the cookie name is "k" 
				k=Integer.parseInt(c.getValue()); 
			}
		}
		
		
		
		//referencing k from the AddServlet
//		int k=Integer.parseInt(req.getParameter("k"));
		
		
		//to get the value used in session management by other servlet
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		//type casting has to be made because session which give you the object of the session
		
		k=k*k;
		
		
		
		PrintWriter out = res.getWriter();
		out.println("<h1> this is sq servlet </h1>");
		out.println("Result is "+ k);
		

		
		System.out.println("SQ called...");
		
		
	}
	
}

package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 request.getRequestDispatcher("link.html").include(request, response);
		 HttpSession session=request.getSession(false);
		 if(session!=null) {
			 session.invalidate(); 
			 request.getRequestDispatcher("index.html").include(request, response);
		 }
		 else
		 {
			 out.print("plesae login...");
			 request.getRequestDispatcher("index.html").include(request, response);
		 }
		 out.close();
		  
		 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

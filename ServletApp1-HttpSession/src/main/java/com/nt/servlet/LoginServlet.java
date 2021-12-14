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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	// request.getRequestDispatcher("link.html").include(request, response);
	 String username=request.getParameter("name");
	 String password=request.getParameter("password");
	 
	 if(password.equals("admin@123"))
	 {
		 out.print("wellcome"+username);
		 HttpSession session=request.getSession();
		 session.setAttribute("username", username);
		// request.getRequestDispatcher("ProfileServlet").forward(request, response);
	 }else
	 {
		 
		 request.getRequestDispatcher("link.html").include(request, response);
		 
		 out.print("Sorry username or password error");
		 
		 
	 }
	
	 out.close();
	 
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}

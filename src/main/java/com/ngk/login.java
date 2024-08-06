package com.ngk;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ngk.db.DBconnection;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		DBconnection  db=new DBconnection();
		//System.out.println("connection established");

		
		if(db.check(uname,pass)) {

			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("Welcome.jsp");

		}
		else {
			response.sendRedirect("Login.jsp");
		}
		
	}

	
}

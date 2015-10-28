package ru.kazarin.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method in console.");
		String userName = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		if (userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
		}
		
		writer.println("Request name = " + userName);
		writer.println("Session name = " + (String) session.getAttribute("savedUserName"));
	}

}

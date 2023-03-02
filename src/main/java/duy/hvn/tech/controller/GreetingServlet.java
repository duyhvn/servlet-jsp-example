package duy.hvn.tech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/sayGreeting")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1007536536668482681L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String country = request.getParameter("country");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + firstName + "</h1>");
		writer.println("<h2>Your full name is: " + firstName + " " + lastName+ "</h2>");
		writer.println("<h2>You are from: " + country + "</h2>");
		writer.close();
	}
}

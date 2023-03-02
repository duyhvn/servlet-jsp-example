package duy.hvn.tech.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HelloServlet
 */
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 7333310856709613995L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/static/pages/home.jsp");
		view.forward(request, response);

		/*PrintWriter writer = response.getWriter();
		String str = "<html>\n" +
				"<head>\n" +
				"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n" +
				"    <title>Home</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<h1>Hello JSP and Servlet!</h1>\n" +
				"<form action=\"helloServlet\" method=\"post\">\n" +
				"    Enter your name: <input type=\"text\" name=\"yourName\" size=\"20\">\n" +
				"    <input type=\"submit\" value=\"Call Servlet\"/>\n" +
				"</form>\n" +
				"</body>\n" +
				"</html>";
		writer.println(str);
		writer.close();*/
	}
}

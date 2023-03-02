package duy.hvn.tech.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(name = "/adminServlet", urlPatterns = "/admin/adminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 5421830455156962841L;

	@Override
	public void init() {
		// Initialization code...
		System.out.println(11);
	}

	@Override
	public void destroy() {
		System.out.println(222);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/static/pages/admin.jsp");
		view.forward(request, response);
	}
}

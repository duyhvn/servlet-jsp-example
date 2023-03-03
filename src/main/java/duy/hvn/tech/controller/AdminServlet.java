package duy.hvn.tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
@Configurable
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 5421830455156962841L;

	@Autowired
	private duy.hvn.tech.service.AdminService adminService;

	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

	}

	@Override
	public void destroy() {
		System.out.println(222);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("admin", adminService);
		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/static/pages/admin.jsp");
		view.forward(request, response);
	}
}

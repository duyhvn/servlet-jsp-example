package duy.hvn.tech.controller;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 5421830455156962841L;

	@Override
	public void init() {
		// Initialization code...
		System.out.println(11);
	}

	@Override
	public void destroy() {
		// Finalization code...
		System.out.println(222);
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) {
		System.out.println("====service=====");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		System.out.println("====doGet=====");
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("====doPost=====");
	}

}

package fr.daguerretech.webdemo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String name = "";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp/welcome.jsp");
	    requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		name = req.getParameter("name");
		if(null==name) name = "";
		System.out.println(name);
		req.setAttribute("name", name);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp/welcome.jsp");
	    requestDispatcher.forward(req, resp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

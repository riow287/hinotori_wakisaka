/*
* WebApp_05_sp03_UseBean
* servlet.EmployeeAlterFormServlet.java
*/
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* 従業員情報の変更入力フォーム画面への遷移を制御する
* @author emBex Education
*/
@WebServlet("/employee-alter-form-servlet")
public class EmployeeAlterFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public EmployeeAlterFormServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher("employee-alter-form.jsp");
		rd.forward(request, response);
	}
}
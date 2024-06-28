/*
* WebApp_05_sp03_UseBean
* servlet.EmployeeAlterConfirmServlet.java
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
* 従業員情報の変更確認画面への遷移を制御する
* @author emBex Education
*/
@WebServlet("/employee-alter-confirm-servlet")
public class EmployeeAlterConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public EmployeeAlterConfirmServlet() {
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
		RequestDispatcher rd = request.getRequestDispatcher("employee-alter-confirm.jsp");
		rd.forward(request, response);
	}
}
/*
* WebApp_02_sp04_Session
* servlet.LoginFormServlet.java
*/
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* ログインフォームから送信されたリクエストを処理する
* @author emBex Education
*/
@WebServlet("/login")
public class LoginFormServlet extends HttpServlet {
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public LoginFormServlet() {
		super();
	}
	
	/**
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	* response)
	*/
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	* response)
	*/
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// リクエストオブジェクトのエンコーディング方式の指定
		request.setCharacterEncoding("UTF-8");
		// リクエストパラメータの取得
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String url; // 転送先
		if ("embexEdu".equals(password)) {
			// セッションオブジェクトの取得
			HttpSession session = request.getSession();
			// セッションスコープへの属性の設定
			session.setAttribute("name", name);
			// 転送先の設定
			url = "login-success";
		} else {
			// 転送先の設定
			url = "login-failure.html";
		}
		// リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
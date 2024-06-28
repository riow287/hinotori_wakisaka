/*
* WebApp_02_sp03_RequestScorp
* servlet.ApplyFormServlet.java
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
* 依頼フォームから送信されたリクエストを受け付ける
* @author emBex Education
*/
@WebServlet("/apply")
public class ApplyFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public ApplyFormServlet() {
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

		// リクエストスコープへの属性の設定
		request.setAttribute("message", "またのご利用をお待ちしております");
		
		// 転送先のパスを指定して転送処理用オブジェクトを取得
		RequestDispatcher rd = request.getRequestDispatcher("/transfer");
		
		// リクエストの転送
		rd.forward(request, response);
	}
}
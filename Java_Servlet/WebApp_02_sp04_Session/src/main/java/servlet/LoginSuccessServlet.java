/*
* WebApp_02_sp04_Session
* servlet.LoginSuccessServlet.java
*/
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* ログイン成功画面をレスポンスする
* @author emBex Education
*/
@WebServlet("/login-success")
public class LoginSuccessServlet extends HttpServlet {
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public LoginSuccessServlet() {
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
		// セッションオブジェクトの取得
		HttpSession session = request.getSession();
		// セッションスコープからの属性値の取得
		String name = (String) session.getAttribute("name");
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html><head><title>ログイン成功</title></head>");
		pw.println("<body>");
		pw.println("ようこそ、" + name + "さん<br>ログインに成功しました。<br>");
		pw.println("<form action=\"logout\" method=\"POST\">");
		pw.println("<input type=\"submit\" value=\"ログアウト\">");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
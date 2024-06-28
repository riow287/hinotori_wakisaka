/*
* WebApp_02_sp04_Session
* servlet.LogoutServlet.java
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
* ログアウト処理を行う
* @author emBex Education
*/
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public LogoutServlet() {
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
		// セッションオブジェクトの無効化
		session.invalidate();
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html><head><title>ログアウト</title></head>");
		pw.println("<body>");
		pw.println(name + "さん、お疲れ様でした。<br>");
		pw.println("<a href=\"./login-form.html\">ログインフォームに戻る</a>");
		pw.println("</body></html>");
	}
}
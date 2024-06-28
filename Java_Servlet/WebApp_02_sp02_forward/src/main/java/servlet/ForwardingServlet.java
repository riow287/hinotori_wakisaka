/*
* WebApp_02_sp02_forward
* servlet.ForwardingServlet.java
*/
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* 依頼フォームから送信されたリクエストのレスポンスを生成する
* @author emBex Education
*/
@WebServlet("/transfer")
public class ForwardingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public ForwardingServlet() {
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
		
		// リクエストのエンコーディング方式を指定
		request.setCharacterEncoding("UTF-8");

		// リクエストパラメータの取得
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String[] ask = request.getParameterValues("ask");
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		//レスポンスの書き出し
		pw.println("<!--ForwardingServletによる書き出し-->");
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>依頼受付完了</title></head>");
		pw.println("<body>");
		pw.println("依頼を受け付けました<br>");
		pw.println("名前：" + name + "<br>");
		pw.println("連絡方法：" + contact + "<br>");
		pw.print("依頼内容：");
		for (String str : ask) {
			pw.print(str + " ");
		}
		pw.println();
		pw.println("</body></html>");
	}
}
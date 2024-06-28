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
* 送信されたリクエストの処理を行う
* @author name
*/
@WebServlet("/question1")
public class Question1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		// セッションオブジェクトの取得
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		
		session.setAttribute("name", name);
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");		
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>質問1</title></head>");
		pw.println("<body>");
		pw.println("<p>質問1: " + name + "さんの趣味は何ですか？</p>");
		pw.println("<form action=\"/WebApp_ex0203/question2\" method=\"POST\">");
		pw.println("<input type=\"radio\" name=\"hobby\" value=\"映画\">映画<br>");
		pw.println("<input type=\"radio\" name=\"hobby\" value=\"ゲーム\">ゲーム<br>");
		pw.println("<input type=\"radio\" name=\"hobby\" value=\"読書\">読書<br>");
		pw.println("<input type=\"submit\" value=\"次の質問\">");
		pw.println("</form>");
		pw.println("</body></html>");
	}
	
}

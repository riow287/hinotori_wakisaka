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
 * Servlet implementation class EndSurvey
 */
@WebServlet("/end-survey")
public class EndSurvey extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EndSurvey() {
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
		
		// セッションスコープからの属性値の取得
		String name = (String) session.getAttribute("name");
		String hobby = (String) session.getAttribute("hobby");
		
		String region = request.getParameter("region");
		
		// セッションオブジェクトの無効化
		session.invalidate();
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>アンケート終了</title></head>");
		pw.println("<body>");
		pw.println("<p>ご協力ありがとうございました。</p>");
		pw.println("<p>" + name + "さんの回答内容</p>");
		pw.println("<p>趣味: " + hobby + "</p>");
		pw.println("<p>お住まい: " + region + "地方</p>");
		pw.println("</body></html>");
	}
	
}

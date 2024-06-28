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
@WebServlet("/question2")
public class Question2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question2() {
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
		String name = (String) session.getAttribute("name");

		String hobby = request.getParameter("hobby");
		
		session.setAttribute("hobby", hobby);
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");		
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>質問2</title></head>");
		pw.println("<body>");
		pw.println("<p>質問2: " + name + "さんのお住まいはどちらですか？</p>");
		pw.println("<form action=\"/WebApp_ex0203/end-survey\" method=\"POST\">");
		pw.println("<select name=\"region\">");
		pw.println("<option value=\"北海道\">北海道</option>");
		pw.println("<option value=\"東北\">東北</option>");
		pw.println("<option value=\"関東\">関東</option>");
		pw.println("<option value=\"中部\">中部</option>");
		pw.println("<option value=\"近畿\">近畿</option>");
		pw.println("<option value=\"中国四国\">中国・四国</option>");
		pw.println("<option value=\"九州\">九州</option>");
		pw.println("</select>");
		pw.println("<input type=\"submit\" value=\"回答終了\">");
		pw.println("</form>");
		pw.println("</body></html>");
	}
	
}

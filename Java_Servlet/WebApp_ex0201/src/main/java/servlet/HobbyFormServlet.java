package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* 送信されたリクエストの処理を行う
* @author name
*/
@WebServlet("/hobby-form-servlet")
public class HobbyFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HobbyFormServlet() {
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
		
		// リクエストパラメータの取得
		String hobby = request.getParameter("hobby");
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>趣味表示</title></head>");
		pw.println("<body>");
		pw.println("あなたの趣味は" + hobby + "です。");
		pw.println("</body></html>");
	}
}
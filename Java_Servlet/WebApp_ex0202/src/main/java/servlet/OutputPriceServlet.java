package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputPriceServlet
 */
@WebServlet("/output-price-servlet")
public class OutputPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OutputPriceServlet() {
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
		
		// リクエストからパラメータを取得
		int quantity = (int) request.getAttribute("quantity");
		double discountRate = (double) request.getAttribute("discountRate");
		int totalPrice = (int) request.getAttribute("totalPrice");
		
		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");
		
		// レスポンス書き出し用オブジェクトの取得
		PrintWriter pw = response.getWriter();
		
		// レスポンスの書き出し
		pw.println("<!DOCTYPE html><html>");
		pw.println("<head><title>代金表示</title></head>");
		pw.println("<body>");
		pw.println("<p>お買い上げ個数: " + quantity + "ケース</p>");
		pw.println("<p>割引率: " + discountRate + "%</p>");
		pw.println("<p>商品代金: " + totalPrice + "円</p>");
		pw.println("</body></html>");
	}
	
}

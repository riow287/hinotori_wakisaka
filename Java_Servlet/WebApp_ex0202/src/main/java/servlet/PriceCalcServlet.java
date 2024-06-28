package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* 送信されたリクエストを受け付けて計算する
* @author name
*/
@WebServlet("/price-calc-servlet")
public class PriceCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PriceCalcServlet() {
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
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		// 代金計算
		int normalPrice = 10000; // 通常価格
		
		double discountRate = 0.0; // 割引率
		if (quantity >= 8) {
			discountRate = 0.15;
		} else if (quantity >= 5) {
			discountRate = 0.10;
		}
		
		// 合計
		int totalPrice = (int) (normalPrice * quantity * (1 - discountRate));
		
		
		// パラメータをリクエストにセット
		request.setAttribute("quantity", quantity);
		request.setAttribute("discountRate", discountRate * 100);
		request.setAttribute("totalPrice", totalPrice);
		
		// 転送先のパスを指定して転送処理用オブジェクトを取得
		RequestDispatcher rd = request.getRequestDispatcher("/output-price-servlet");
		
		// リクエストの転送
		rd.forward(request, response);
		
	}
	
}

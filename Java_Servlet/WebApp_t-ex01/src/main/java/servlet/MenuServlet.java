package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.UserDAO;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストオブジェクトのエンコーディング方式の指定
		request.setCharacterEncoding("UTF-8");

		// セッションの取得
		HttpSession session = request.getSession();

        String userId = (String) session.getAttribute("userId");
        String password = (String) session.getAttribute("password");

		// 転送先
		String url;

		boolean bResult = false;

		// daoの生成
		UserDAO dao = new UserDAO();

		try {
			bResult = dao.authentication(userId, password);

			if (bResult) {

				// 転送先の設定
				url = "menu.jsp";

			} else {
				// 転送先の設定
				url = "login.html";
			}
			
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

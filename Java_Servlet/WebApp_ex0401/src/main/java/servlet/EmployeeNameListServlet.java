package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeNameListServlet
 */
@WebServlet("/employee-name-list-servlet")
public class EmployeeNameListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeNameListServlet() {
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
		
		final String URL = "jdbc:mysql://localhost:3306/sampledb";
		final String USER = "embexU";
		final String PASSWORD = "embexP";
		
		request.setCharacterEncoding("UTF-8");
		
		List<String> nameList = new ArrayList<String>();
		
		String section = request.getParameter("section");
		
		try {
			// JDBCドライバの読み込み
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
			String sql = "SELECT name FROM m_employee WHERE section = ?";
			try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
					PreparedStatement pstmt = con.prepareStatement(sql)) {
				
				// プレースホルダへの値の設定
				pstmt.setString(1, section);
				
				// SQLステートメントの実行
				ResultSet res = pstmt.executeQuery();
				
				// 結果の操作
				while (res.next()) {
					nameList.add(res.getString("name"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			// リクエストスコープへの属性の設定
			request.setAttribute("nameList", nameList);
			request.setAttribute("section", section);
			
			// リクエストの転送
			RequestDispatcher rd = request.getRequestDispatcher("employee-name-list.jsp");
			rd.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

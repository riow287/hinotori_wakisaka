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

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

/**
 * 従業員情報の登録
 */
@WebServlet("/employee-registration-servlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeRegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		// リクエストパラメーターから従業員情報を取得
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String section = request.getParameter("section");

		// 従業員オブジェクト
		EmployeeBean employee = new EmployeeBean();
		employee.setCode(code);
		employee.setName(name);
		employee.setAge(age);
		employee.setSection(section);

		// DAOの生成
		EmployeeDAO dao = new EmployeeDAO();

		// 処理件数
		int processingNumber = 0; 

		try {
			// DAOを利用し従業員情報を1件挿入
			processingNumber = dao.insert(employee);
			
			// セッションオブジェクトの取得
			HttpSession session = request.getSession();
			
			// セッションスコープへの属性の設定
			session.setAttribute("employee", employee);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		// リクエストスコープへの属性の設定
		request.setAttribute("processingNumber", processingNumber);

		// リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher("employee-registration-result.jsp");
		rd.forward(request, response);
	}
}
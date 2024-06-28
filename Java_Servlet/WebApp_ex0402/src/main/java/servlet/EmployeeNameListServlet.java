package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;

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
		
		request.setCharacterEncoding("UTF-8");
		String section = request.getParameter("section");
		
		List<String> nameList = null;
		
		// DAOの生成
		EmployeeDAO dao = new EmployeeDAO();
		
		try {
			// DAOの利用
			nameList = dao.selectName(section);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// リクエストスコープへの属性の設定
		request.setAttribute("nameList", nameList);
		request.setAttribute("section", section);
		
		// リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher("employee-name-list.jsp");
		rd.forward(request, response);
		
	}
}

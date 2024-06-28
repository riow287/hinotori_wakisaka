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

import dao.MembersDAO;

/**
 * Servlet implementation class IdolNameListServlet
 */
@WebServlet("/member-name-list-servlet")
public class MemberNameListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberNameListServlet() {
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

		request.setCharacterEncoding("UTF-8");
		String group_name = request.getParameter("group_name");
		String member_name = request.getParameter("member_name");

		List<String> memberList = null;
		String foward = "form.html";
		String input = "";

		// DAOの生成
		MembersDAO dao = new MembersDAO();

		try {
			// DAOの利用
			// グループ名での検索
			if (group_name != null && !group_name.isEmpty()) {
				memberList = dao.selectGroup(group_name);
				foward = "member-name-list1.jsp";
			} 
			// メンバー名での検索
			else if (member_name != null && !member_name.isEmpty()) {
				memberList = dao.selectByName(member_name);
				input = member_name;
				foward = "member-name-list2.jsp";
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// リクエストスコープへの属性の設定
		request.setAttribute("memberList", memberList);
		request.setAttribute("group_name", group_name);
		request.setAttribute("input", input);

		// リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher(foward);
		rd.forward(request, response);

	}
}

package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.UserBean;

/**
 * Servlet implementation class UserDAO
 */
public class UserDAO {

	/**
	 * ログイン認証
	 * 
	 * @return 認証の結果
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean authentication(String userId, String inputPassword) throws SQLException, ClassNotFoundException {

		// 認証結果の変数を初期化
		boolean bResult = false;

//		String sql = "SELECT * FROM m_user WHERE user_id = ? AND password = ?";

		String sql = "SELECT * FROM m_user WHERE user_id = ?";

		// データベースへの接続の取得、PreparedStatement、SQLステートメントの実行
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

			// プレースホルダへの値の設定
			pstmt.setString(1, userId);
//			pstmt.setString(2, password);

			ResultSet res = pstmt.executeQuery();

			// 結果が1つ以上ある？　ユーザーがいる
			if (res.next()) {

				String userPassword = res.getString("password");

				// 入力されたパスワードと同じかどうか
				if (userPassword.equals(inputPassword)) {

					bResult = true;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bResult;
	}

	/**
	 * すべてのユーザのリストを返します。
	 * 
	 * @return ユーザのリスト
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<UserBean> selectAll() throws SQLException, ClassNotFoundException {

		List<UserBean> userList = new ArrayList<UserBean>();
		String sql = "SELECT * FROM m_user";

		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

			ResultSet res = pstmt.executeQuery();

			// 結果の操作
			while (res.next()) {

				UserBean user = new UserBean();

				user.setId(res.getString("user_id"));
				user.setName(res.getString("name"));
				user.setAge(res.getInt("age"));

				userList.add(user);
			}
		}
		return userList;
	}

}
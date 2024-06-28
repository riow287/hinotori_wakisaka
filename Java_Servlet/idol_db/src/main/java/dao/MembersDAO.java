package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * membersテーブルのDAOです。
 * 
 * @author name
 */
public class MembersDAO {
	/**
	 * すべてのアイドルのリストを返します。
	 * 
	 * @return アイドルのリスト
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<String> selectGroup(String group_name) throws SQLException, ClassNotFoundException {

		List<String> memberList = new ArrayList<String>();
		String sql = "SELECT * FROM members WHERE group_name = ?";

		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			// プレースホルダへの値の設定
			pstmt.setString(1, group_name);

			// SQLステートメントの実行
			ResultSet res = pstmt.executeQuery();

			// 結果の操作
			while (res.next()) {
				memberList.add(res.getString("member_name"));
			}

		} catch (

		SQLException e) {
			e.printStackTrace();
		}

		return memberList;
	}

	public List<String> selectByName(String member_name) throws SQLException, ClassNotFoundException {
		List<String> memberList = new ArrayList<>();
		String sql = "SELECT * FROM members WHERE member_name LIKE ?";

		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			// プレースホルダへの値の設定
			pstmt.setString(1, "%" + member_name + "%");

			// SQLステートメントの実行
			ResultSet res = pstmt.executeQuery();

			// 結果の操作
			while (res.next()) {
				memberList.add(res.getString("member_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return memberList;
	}
}
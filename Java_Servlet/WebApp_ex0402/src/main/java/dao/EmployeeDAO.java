package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* m_employeeテーブルのDAOです。
* @author name
*/
public class EmployeeDAO {
	/**
	* すべての従業員の氏名のリストを返します。
	* @return 従業員の氏名のリスト
	* @throws SQLException
	* @throws ClassNotFoundException
	*/
	public List<String> selectName(String section) throws SQLException, ClassNotFoundException {
		
		List<String> nameList = new ArrayList<String>();
		
		String sql = "SELECT name FROM m_employee WHERE section = ?";
		
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			// プレースホルダへの値の設定
			pstmt.setString(1, section);
			
			// SQLステートメントの実行
			ResultSet res = pstmt.executeQuery();
			
			// 結果の操作
			while (res.next()) {
				nameList.add(res.getString("name"));
			}
			
		} catch (
		
		SQLException e) {
			e.printStackTrace();
		}
		
		return nameList;
	}
}
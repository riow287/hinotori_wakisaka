/*
* WebApp_04_sp02_DAO
* dao.EmployeeDAO.java
*/
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
* m_employeeテーブルのDAOです。
* @author emBex Education
*/
public class EmployeeDAO {
	/**
	* すべての従業員の氏名のリストを返します。
	* @return 従業員の氏名のリスト
	* @throws SQLException
	* @throws ClassNotFoundException
	*/
	public List<String> selectAllName() throws SQLException, ClassNotFoundException {
		List<String> nameList = new ArrayList<String>();
		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try (Connection con = ConnectionManager.getConnection();
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery("SELECT name FROM m_employee")) {
			// 結果の操作
			while (res.next()) {
				nameList.add(res.getString("name"));
			}
		}
		return nameList;
	}
}
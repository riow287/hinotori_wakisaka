package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.entity.EmployeeBean;

/**
 * m_employeeテーブルのDAOです。
 * 
 * @author name
 */
public class EmployeeDAO {
	/**
	 * 従業員情報をデータベースに登録します。
	 * 
	 * @param employee 登録する従業員情報
	 * @return 処理件数
	 */
	public int insert(EmployeeBean employee) throws SQLException, ClassNotFoundException {

		// 処理件数
		int processingNumber = 0;

		// SQL文のセット		
		String sql = "INSERT INTO m_employee (code, name, age, section) VALUES (?, ?, ?, ?)";

		// データベースへの接続の取得、PreparedStatementの取得
		try (Connection con = ConnectionManager.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			//	従業員情報を取得		
			String code = employee.getCode();
			String name = employee.getName();
			int age = employee.getAge();
			String section = employee.getSection();

			//	プレースホルダーにセット		
			pstmt.setString(1, code);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, section);

			// SQLステートメントの実行
			processingNumber = pstmt.executeUpdate();
		}
		return processingNumber;
	}
}
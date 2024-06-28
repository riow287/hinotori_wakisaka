/*
* WebApp_05_sp01_MVC
* model.dao.EmployeeDAO.java
*/
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.EmployeeBean;

/**
* m_employeeテーブルのDAOです。
* @author emBex Education
*/
public class EmployeeDAO {
	
	/**
	* すべての従業員のリストを返します。
	* @return 従業員のリスト
	* @throws SQLException
	* @throws ClassNotFoundException
	*/
	public List<EmployeeBean> selectAll() throws SQLException, ClassNotFoundException {
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try (Connection con = ConnectionManager.getConnection();
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {
			// 結果の操作
			while (res.next()) {
				String code = res.getString("code");
				String name = res.getString("name");
				int age = res.getInt("age");
				String section = res.getString("section");
				EmployeeBean employee = new EmployeeBean();
				employee.setCode(code);
				employee.setName(name);
				employee.setAge(age);
				employee.setSection(section);
				employeeList.add(employee);
			}
		}
		return employeeList;
	}
}
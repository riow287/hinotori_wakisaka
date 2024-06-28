package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * m_employeeテーブルのDAOです。
 * @author name
 */
public class EmployeeDAO {
  /**
   * リストを返します。
   * @param maxAge 指定する年齢
   * @return 従業員オブジェクトのリスト
   * @throws SQLException
   */
  public List<Employee> select(int maxAge) throws SQLException {

    List<Employee> employeeList = new ArrayList<>();

    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt =
             con.prepareStatement("SELECT * FROM m_employee WHERE age <= ?");) {

      pstmt.setInt(1, maxAge);

      ResultSet res = pstmt.executeQuery();

      while (res.next()) {
        String code = res.getString("code");
        String name = res.getString("name");
        int age = res.getInt("age");
        String section = res.getString("section");
        
        Employee employee = new Employee();
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

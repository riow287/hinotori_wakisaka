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

  public int insert(Employee employee) {
    String sql =
        "INSERT INTO m_employee (code, name, age, section) VALUES (?, ?, ?, ?)";

    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(sql);) {

      pstmt.setString(1, employee.getCode());
      pstmt.setString(2, employee.getName());
      pstmt.setInt(3, employee.getAge());
      pstmt.setString(4, employee.getSection());
      return pstmt.executeUpdate();

    } catch (SQLException e) {
      return 0;
    }
  }

  public int delete(String code) {
    String sql = "DELETE FROM m_employee WHERE code = ?";

    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(sql);) {

      pstmt.setString(1, code);
      return pstmt.executeUpdate();

    } catch (SQLException e) {
      return 0;
    }
  }

  /**
   * すべての従業員情報のリストを返す
   * @param
   * @return 従業員オブジェクトのリスト
   * @throws SQLException
   */
  public List<Employee> selectAll() throws SQLException {

    List<Employee> employeeList = new ArrayList<>();

    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt =
             con.prepareStatement("SELECT * FROM m_employee");) {

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

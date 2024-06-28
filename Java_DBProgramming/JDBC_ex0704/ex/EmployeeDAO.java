package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * m_employee�e�[�u����DAO�ł��B
 * @author name
 */
public class EmployeeDAO {
  /**
   * ���X�g��Ԃ��܂��B
   * @param maxAge �w�肷��N��
   * @return �]�ƈ��I�u�W�F�N�g�̃��X�g
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

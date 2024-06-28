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
   * 従業員の部署を変更します。
   * @param code 従業員のコード
   * @param section 部署
   * @return 更新されたレコード数
   * @throws SQLException
   */
  public int updateSection(String code, String section) throws SQLException {

    int count = 0; // 処理件数

    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "UPDATE m_employee SET section = ? WHERE code = ?")) {

      pstmt.setString(1, section);
      pstmt.setString(2, code);

      count = pstmt.executeUpdate();
    }
    return count;
  }
}

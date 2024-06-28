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
   * �]�ƈ��̕�����ύX���܂��B
   * @param code �]�ƈ��̃R�[�h
   * @param section ����
   * @return �X�V���ꂽ���R�[�h��
   * @throws SQLException
   */
  public int updateSection(String code, String section) throws SQLException {

    int count = 0; // ��������

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

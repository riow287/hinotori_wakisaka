package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * m_employee�e�[�u����DAO�ł��B
 * @author name
 */
public class EmployeeDAO {
  /**
   * ����̔N��w�̏]�ƈ��̎����̃��X�g��Ԃ��܂��B
   * @param minAge �N��̍ŏ��l
   * @param maxAge �N��̍ő�l
   * @return �]�ƈ��̎����̃��X�g
   * @throws SQLException
   */
  public List<String> selectName(int minAge, int maxAge) throws SQLException {

    List<String> nameList = new ArrayList<String>(); // ����

    // �f�[�^�x�[�X�ւ̐ڑ��̎擾�APreparedStatement�̎擾
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE age BETWEEN ? AND ?")) {

      // �v���[�X�z���_�ւ̒l�̐ݒ�
      pstmt.setInt(1, minAge);
      pstmt.setInt(2, maxAge);

      // SQL�X�e�[�g�����g�̎��s
      ResultSet res = pstmt.executeQuery();

      // ���ʂ̑���
      while (res.next()) {
        nameList.add(res.getString("name"));
      }
    }
    return nameList;
  }
}

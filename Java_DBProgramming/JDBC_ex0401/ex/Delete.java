package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �������c�ƕ��̏]�ƈ����R�[�h���폜���ĕ\������
 * @author name
 */
public class Delete {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement()) {

      String sql = "DELETE FROM m_employee WHERE section = '�c�ƕ�'";

      int count = stmt.executeUpdate(sql);
      System.out.println("�c�ƕ��̏]�ƈ��̃��R�[�h" + count + "�����폜���܂����B");

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}

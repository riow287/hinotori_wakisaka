package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �]�ƈ�����ǉ�����
 * @author name
 */
public class Insert {

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

      String sql = "INSERT INTO m_employee (code, name, age, section) VALUES (201076, '�ߓ����', 27, '�c�ƕ�')";

      int count = stmt.executeUpdate(sql);
      System.out.println(count + "���̃��R�[�h��o�^���܂����B");

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}

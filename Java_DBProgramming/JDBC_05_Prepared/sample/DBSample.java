/*
 * JDBC_05_Prepared
 * sample.DBSample.java
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatement���g�����T���v���v���O�����ł��B
 * @author emBex Education
 */
public class DBSample {
  /**
   * �R�}���h���C�������Ŏw�肵�������̏]�ƈ�����\������
   * @param args ������
   */
  public static void main(String[] args) {
    /* �f�[�^�x�[�XURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";

    /* �f�[�^�x�[�X�̃��[�U�ƃp�X���[�h*/
    String user = "sofdU";
    String password = "sofdP";

    String sql = "SELECT * FROM m_employee WHERE section = ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setString(1, args[0]);

      ResultSet res = pstmt.executeQuery();

      // ResultSet�̑���
      while (res.next()) {
        System.out.print(res.getString("code") + "\t| ");
        System.out.print(res.getString("name") + "\t| ");
        System.out.print(res.getInt("age") + "\t| ");
        System.out.print(res.getString("section") + "\n");
      }

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
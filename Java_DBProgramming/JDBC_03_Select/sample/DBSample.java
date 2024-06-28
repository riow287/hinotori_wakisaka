/*
 * JDBC_03_Select
 * sample.DBSample.java
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �Q�ƌnSQL�̎��s���s���T���v���v���O�����ł��B
 * @author emBex Education
 */
public class DBSample {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    /* �f�[�^�x�[�XURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";

    /* �f�[�^�x�[�X�̃��[�U�ƃp�X���[�h*/
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {

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
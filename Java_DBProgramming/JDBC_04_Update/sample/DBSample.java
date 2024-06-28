/*
 * JDBC_04_Update
 * sample.DBSample.java
 */
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �X�V�nSQL�̎��s���s���T���v���v���O�����ł��B
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
         Statement stmt = con.createStatement()) {

      String sql = "UPDATE m_employee SET age = 18 WHERE code = '201021'";

      // SQL�X�e�[�g�����g�̎��s�i�X�V�n�j
      int count = stmt.executeUpdate(sql);
      System.out.println(count + "���̃f�[�^���X�V���܂����B");

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}

//  ('201021', '�c����Y', 35, '�c�ƕ�')
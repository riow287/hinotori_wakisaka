package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet res =
             stmt.executeQuery("SELECT code, name, age FROM m_employee WHERE section = '�J����'")) {

      System.out.println("���J�����̏]�ƈ��ꗗ");
      int num = 1;
      while (res.next()) {
        int code = res.getInt("code");
        String name = res.getString("name");
        int age = res.getInt("age");
        System.out.println(num + "�F" + code + " " + name + " " + age);
        num ++;
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}

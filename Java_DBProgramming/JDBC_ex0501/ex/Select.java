package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatement���g��
 * @author name
 */
public class Select {
  /**
   * ���C�����\�b�h
   * �R�}���h���C�������Ŏw�肵���N��̏]�ƈ�����\������
   * @param args �N��
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    String sql = "SELECT * FROM m_employee WHERE age >= ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setString(1, args[0]);

      ResultSet res = pstmt.executeQuery();

      System.out.println("�N�" + args[0] + "�ȏ�̏]�ƈ��ꗗ");
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
package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatement���g���]�ƈ����R�[�h���f�[�^�x�[�X�ɒǉ�����
 * @author name
 */
public class Insert {
  /**
   * ���C�����\�b�h
   * �R�}���h���C�������Ŏw�肵�����e�̏]�ƈ����R�[�h���f�[�^�x�[�X�ɓo�^����
   * @param args �R�[�h ���� �N�� ����
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    String sql =
        "INSERT INTO m_employee (code, name, age, section) VALUES (?, ?, ?, ?)";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setInt(1, Integer.parseInt(args[0])); // �R�[�h
      pstmt.setString(2, args[1]);                // ���O
      pstmt.setInt(3, Integer.parseInt(args[2])); // �N��
      pstmt.setString(4, args[3]);                // ����

      int count = pstmt.executeUpdate();
      System.out.println(count + "���̃��R�[�h��o�^���܂����B");
    }
    catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
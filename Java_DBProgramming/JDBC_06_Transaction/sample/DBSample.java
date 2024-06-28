/*
 * JDBC_06_Transaction
 * sample.DBSample.java
 */
package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * �g�����U�N�V����������s���T���v���N���X�ł��B
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
    String user = "embexU";
    String password = "embexP";
    try (Connection con = DriverManager.getConnection(url, user, password)) {
      try (Statement stmt = con.createStatement()) {
        con.setAutoCommit(false);
        String sql1 = "UPDATE m_employee"
                      + " SET section = '�̔����ƕ�' WHERE section = '�c�ƕ�'";
        String sql2 =
            "UPDATE m_employee"
            + " SET section = '�V�X�e���J����' WHERE section = '�J����'";
        String sql3 = "UPDATE m_employee SET"
                      + " section = '�l�ފJ����' WHER section = '���C��'";
        int count = 0; // ��������
        count += stmt.executeUpdate(sql1);
        count += stmt.executeUpdate(sql2);
        count += stmt.executeUpdate(sql3);
        con.commit();
        System.out.println(count + "���̃f�[�^���X�V����܂����B");
      } catch (SQLException e) {
        con.rollback();
        System.out.println("���[���o�b�N����܂����B");
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
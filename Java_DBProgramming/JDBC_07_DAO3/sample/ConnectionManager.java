/*
 * JDBC_07_DAO3
 * sample.ConnectionManager.java
 */
package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * �R�l�N�V�����}�l�[�W���[
 * @author emBex Education
 */
public class ConnectionManager {
  /**
   * �f�[�^�x�[�XURL
   */
  private final static String URL = "jdbc:mysql://localhost:3306/sampledb";
  /**
   * ���[�U
   */
  private final static String USER = "embexU";
  /**
   * �p�X���[�h
   */
  private final static String PASSWORD = "embexP";
  /**
   * �f�[�^�x�[�X�ւ̐ڑ����擾���ĕԂ��܂��B
   *
   * @return �R�l�N�V����
   * @throws SQLException
   */
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
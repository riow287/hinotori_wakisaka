/*
 * JDBC_07_DAO3
 * sample.ConnectionManager.java
 */
package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * コネクションマネージャー
 * @author emBex Education
 */
public class ConnectionManager {
  /**
   * データベースURL
   */
  private final static String URL = "jdbc:mysql://localhost:3306/sampledb";
  /**
   * ユーザ
   */
  private final static String USER = "embexU";
  /**
   * パスワード
   */
  private final static String PASSWORD = "embexP";
  /**
   * データベースへの接続を取得して返します。
   *
   * @return コネクション
   * @throws SQLException
   */
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
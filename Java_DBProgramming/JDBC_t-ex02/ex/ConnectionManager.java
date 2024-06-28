package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクションマネージャー
 * @author name
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
   * データベースへの接続しConnectionオブジェクトを返します。
   * @return コネクション
   * @throws SQLException
   */
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
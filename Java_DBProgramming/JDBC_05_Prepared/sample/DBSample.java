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
 * PreparedStatementを使ったサンプルプログラムです。
 * @author emBex Education
 */
public class DBSample {
  /**
   * コマンドライン引数で指定した部署の従業員情報を表示する
   * @param args 部署名
   */
  public static void main(String[] args) {
    /* データベースURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";

    /* データベースのユーザとパスワード*/
    String user = "sofdU";
    String password = "sofdP";

    String sql = "SELECT * FROM m_employee WHERE section = ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setString(1, args[0]);

      ResultSet res = pstmt.executeQuery();

      // ResultSetの操作
      while (res.next()) {
        System.out.print(res.getString("code") + "\t| ");
        System.out.print(res.getString("name") + "\t| ");
        System.out.print(res.getInt("age") + "\t| ");
        System.out.print(res.getString("section") + "\n");
      }

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
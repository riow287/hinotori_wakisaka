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
 * 参照系SQLの実行を行うサンプルプログラムです。
 * @author emBex Education
 */
public class DBSample {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    /* データベースURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";

    /* データベースのユーザとパスワード*/
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {

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
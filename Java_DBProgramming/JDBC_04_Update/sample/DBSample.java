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
 * 更新系SQLの実行を行うサンプルプログラムです。
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
         Statement stmt = con.createStatement()) {

      String sql = "UPDATE m_employee SET age = 18 WHERE code = '201021'";

      // SQLステートメントの実行（更新系）
      int count = stmt.executeUpdate(sql);
      System.out.println(count + "件のデータを更新しました。");

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

//  ('201021', '田中一郎', 35, '営業部')
package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement();
         ResultSet res =
             stmt.executeQuery("SELECT code, name, age FROM m_employee WHERE section = '開発部'")) {

      System.out.println("■開発部の従業員一覧");
      int num = 1;
      while (res.next()) {
        int code = res.getInt("code");
        String name = res.getString("name");
        int age = res.getInt("age");
        System.out.println(num + "：" + code + " " + name + " " + age);
        num ++;
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

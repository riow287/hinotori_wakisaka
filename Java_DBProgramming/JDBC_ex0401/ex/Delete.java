package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 部署が営業部の従業員レコードを削除して表示する
 * @author name
 */
public class Delete {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    try (Connection con = DriverManager.getConnection(url, user, password);
         Statement stmt = con.createStatement()) {

      String sql = "DELETE FROM m_employee WHERE section = '営業部'";

      int count = stmt.executeUpdate(sql);
      System.out.println("営業部の従業員のレコード" + count + "件を削除しました。");

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

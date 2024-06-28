package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 従業員情報を追加する
 * @author name
 */
public class Insert {

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

      String sql = "INSERT INTO m_employee (code, name, age, section) VALUES (201076, '近藤千夏', 27, '営業部')";

      int count = stmt.executeUpdate(sql);
      System.out.println(count + "件のレコードを登録しました。");

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

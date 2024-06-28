package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatementを使い
 * @author name
 */
public class Select {
  /**
   * メインメソッド
   * コマンドライン引数で指定した年齢の従業員情報を表示する
   * @param args 年齢
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    String sql = "SELECT * FROM m_employee WHERE age >= ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setString(1, args[0]);

      ResultSet res = pstmt.executeQuery();

      System.out.println("年齢が" + args[0] + "以上の従業員一覧");
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
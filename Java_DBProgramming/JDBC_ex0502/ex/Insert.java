package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * PreparedStatementを使い従業員レコードをデータベースに追加する
 * @author name
 */
public class Insert {
  /**
   * メインメソッド
   * コマンドライン引数で指定した内容の従業員レコードをデータベースに登録する
   * @param args コード 氏名 年齢 部署
   */
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "sofdU";
    String password = "sofdP";

    String sql =
        "INSERT INTO m_employee (code, name, age, section) VALUES (?, ?, ?, ?)";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(sql)) {

      pstmt.setInt(1, Integer.parseInt(args[0])); // コード
      pstmt.setString(2, args[1]);                // 名前
      pstmt.setInt(3, Integer.parseInt(args[2])); // 年齢
      pstmt.setString(4, args[3]);                // 部署

      int count = pstmt.executeUpdate();
      System.out.println(count + "件のレコードを登録しました。");
    }
    catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
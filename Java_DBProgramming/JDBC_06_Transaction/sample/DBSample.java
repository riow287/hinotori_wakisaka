/*
 * JDBC_06_Transaction
 * sample.DBSample.java
 */
package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * トランザクション制御を行うサンプルクラスです。
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
    String user = "embexU";
    String password = "embexP";
    try (Connection con = DriverManager.getConnection(url, user, password)) {
      try (Statement stmt = con.createStatement()) {
        con.setAutoCommit(false);
        String sql1 = "UPDATE m_employee"
                      + " SET section = '販売事業部' WHERE section = '営業部'";
        String sql2 =
            "UPDATE m_employee"
            + " SET section = 'システム開発部' WHERE section = '開発部'";
        String sql3 = "UPDATE m_employee SET"
                      + " section = '人材開発部' WHER section = '研修部'";
        int count = 0; // 処理件数
        count += stmt.executeUpdate(sql1);
        count += stmt.executeUpdate(sql2);
        count += stmt.executeUpdate(sql3);
        con.commit();
        System.out.println(count + "件のデータが更新されました。");
      } catch (SQLException e) {
        con.rollback();
        System.out.println("ロールバックされました。");
        e.printStackTrace();
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
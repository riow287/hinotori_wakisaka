package ex;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * データベースへの接続を行う
 * @author name
 */
public class Test {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    try {
      Connection con = ConnectionManager.getConnection();
      System.out.println("sampledbへの接続に成功しました。");

    } catch (SQLException e) {
      System.out.println("処理結果: 異常が発生しました。");
      e.printStackTrace();
    }
  }
}

package ex;

import java.sql.SQLException;

/**
 * BusinessLogic
 * @author name
 */

public class BusinessLogic {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    // データベースアクセスオブジェクトの生成
    EmployeeDAO dao = new EmployeeDAO();

    // データベースアクセスオブジェクトの利用
    try {

      String code = args[0];
      String section = args[1];

      int count = dao.updateSection(code, section);
      
      System.out.println("*** 特定の従業員の部署を変更する ***");
      System.out.println(count + "件のレコードが更新されました。");

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

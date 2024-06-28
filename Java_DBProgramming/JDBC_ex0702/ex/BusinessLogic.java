package ex;

import java.sql.SQLException;
import java.util.List;

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

      int minAge = 20;
      int maxAge = 29;

      List<String> nameList = dao.selectName(minAge, maxAge);

      System.out.println("*** 特定の年齢層の従業員の氏名のリストを取得 ***");

      System.out.println(minAge + "歳から" + maxAge + "歳の従業員：");
      for (String selectedName : nameList) {
        System.out.print(selectedName + " ");
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

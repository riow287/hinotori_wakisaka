/*
 * JDBC_07_DAO2
 * sample.BusinessLogic.java
 */
package sample;
import java.sql.SQLException;
import java.util.List;
/**
 * EmployeeDAOを使った業務処理を行うクラスです。
 * @author emBex Education
 */
public class BusinessLogic {
  /**
   * メインメソッド
   * @param args この引数は使用しない
   */
  public static void main(String[] args) {
    // データベースアクセスオブジェクトの生成
    EmployeeDAO dao = new EmployeeDAO();
    // データベースアクセスオブジェクトの利用
    try {
      String code = "201063";
      System.out.println("*** 従業員のコードから従業員の氏名を検索***");
      String name = dao.selectName(code);
      System.out.println("codeが「" + code + "」の従業員：" + name);
      System.out.println();
      System.out.println("*** 従業員のコードを指定してレコードを削除***");
      int count = dao.delete(code);
      System.out.print("codeが「" + code + "」の従業員を削除：");
      System.out.println(count + "件のレコードが削除されました。");
      System.out.println();
      System.out.println("*** 特定の部署の従業員の氏名のリストを取得***");
      String section = "営業部";
      List<String> nameList = dao.selectNameList(section);
      System.out.print(section + "の従業員：");
      for (String selectedName : nameList) {
        System.out.print(selectedName + " ");
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
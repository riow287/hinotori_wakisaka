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
      int maxAge = Integer.parseInt(args[0]);

      List<Employee> employeeList = dao.select(maxAge);
      System.out.println("***" + maxAge + "歳以下の従業員情報を表示 ***");

      for (Employee employee : employeeList) {
        System.out.println(employee.getCode() + " | " + employee.getName() +
                           " | " + employee.getAge() + " | " +
                           employee.getSection());
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}

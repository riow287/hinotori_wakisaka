package ex;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

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

    Scanner sc = new Scanner(System.in);

    System.out.println("***** 従業員情報を操作します。*****");
    System.out.println("s: 全従業員の情報を表示します。");
    System.out.println("i: 従業員情報を登録します。");
    System.out.println("d: 特定の従業員情報を削除します。");
    System.out.println("q: システムを終了します。");

    while (true) {
      System.out.print(
          "\n操作を選択してください。[s: すべて表示 i: 登録 d: 削除 q: 終了]：");

      String inputChoice = sc.nextLine();

      // s: 全従業員の情報を表示
      if (inputChoice.equals("s")) {
        try {
          List<Employee> employeeList = dao.selectAll();

          if (employeeList.isEmpty()) {
            System.out.println("従業員情報を表示できませんでした。");
          }

          else if (employeeList != null) {
            System.out.println("*** すべての従業員情報を表示 ***");
            for (Employee employee : employeeList) {
              System.out.println(
                  employee.getCode() + " | " + employee.getName() + " | " +
                  employee.getAge() + " | " + employee.getSection());
            }
          }
        } catch (SQLException e) {
        }
      }

      // i: 従業員情報を登録
      else if (inputChoice.equals("i")) {
        System.out.println("登録する従業員情報を指定してください。");
        Employee employee = new Employee();

        System.out.print("・コード：");
        employee.setCode(sc.nextLine());

        System.out.print("・氏名：");
        employee.setName(sc.nextLine());

        System.out.print("・年齢：");
        employee.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("・部署：");
        employee.setSection(sc.nextLine());

        int insertCount = dao.insert(employee);
        if (insertCount > 0) {
          System.out.println("1件の従業員情報を登録しました。");
        } else {
          System.out.println("従業員情報を登録できませんでした。");
        }
      }

      // d: 特定の従業員情報を削除
      else if (inputChoice.equals("d")) {
        System.out.println("削除する従業員のコードを指定してください。");
        System.out.print("・コード：");
        String inputDeleteCode = sc.nextLine();

        int deleteEmployee = dao.delete(inputDeleteCode);
        if (deleteEmployee > 0) {
          System.out.println("1件の従業員情報を削除しました。");
        } else {
          System.out.println("従業員情報を削除できませんでした。");
        }
      }
      // q: システムを終了
      else if (inputChoice.equals("q")) {
        System.out.println("システムを終了します。");
        break;
      }

      // 入力された文字が指定の文字以外だった場合
      else {
        System.out.println(
            "操作は次の中から選択してください。[s: すべて表示 i: 登録 d: 削除 q: 終了]");
      }
    }
  }
}
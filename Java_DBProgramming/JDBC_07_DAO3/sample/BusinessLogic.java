/*
 * JDBC_07_DAO3
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
      // 従業員情報の登録
      Employee employee = new Employee();
      employee.setCode("201815");
      employee.setName("馬場健一");
      employee.setAge(28);
      employee.setSection("総務部");
      int count = dao.insert(employee);
      System.out.println(count + "件のデータを登録しました。");
      // すべての従業員の情報を表示
      System.out.println("*** すべての従業員情報を表示***");
      List<Employee> employeeList = dao.selectAll();
      for (Employee tempEmp : employeeList) {
        String code = tempEmp.getCode();
        String name = tempEmp.getName();
        int age = tempEmp.getAge();
        String section = tempEmp.getSection();
        System.out.print(code + "\t| ");
        System.out.print(name + "\t| ");
        System.out.print(age + "\t| ");
        System.out.print(section + "\n");
      }
    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
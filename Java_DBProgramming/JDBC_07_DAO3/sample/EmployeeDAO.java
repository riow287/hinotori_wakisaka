/*
 * JDBC_07_DAO3
 * sample.EmployeeDAO.java
 */
package sample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * m_employeeテーブルのDAOです。
 * @author emBex Education
 */
public class EmployeeDAO {
  /**
   * 指定された内容の従業員情報を登録します。
   * @param employee 従業員オブジェクト
   * @return 処理件数
   * @throws SQLException
   */
  public int insert(Employee employee) throws SQLException {
    int count = 0; // 処理件数
    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "INSERT INTO m_employee VALUES(?, ?, ?, ?)")) {
      // DTOからのデータの取り出し
      String code = employee.getCode();
      String name = employee.getName();
      int age = employee.getAge();
      String section = employee.getSection();
      // プレースホルダへの値の設定
      pstmt.setString(1, code);
      pstmt.setString(2, name);
      pstmt.setInt(3, age);
      pstmt.setString(4, section);
      // SQLステートメントの実行
      count = pstmt.executeUpdate();
    }
    return count;
  }
  /**
   * すべての従業員オブジェクトのリストを返します。
   * @return 従業員オブジェクトのリスト
   * @throws SQLException
   */
  public List<Employee> selectAll() throws SQLException {
    List<Employee> employeeList = new ArrayList<Employee>();
    try (Connection con = ConnectionManager.getConnection();
         Statement stmt = con.createStatement();
         ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {
      while (res.next()) {
        String code = res.getString("code");
        String name = res.getString("name");
        int age = res.getInt("age");
        String section = res.getString("section");
        Employee employee = new Employee();
        employee.setCode(code);
        employee.setName(name);
        employee.setAge(age);
        employee.setSection(section);
        employeeList.add(employee);
      }
    }
    return employeeList;
  }
  /**
   * 指定されたコードから従業員の氏名を検索して返します。
   * @param code 従業員のコード
   * @return 従業員の氏名
   * @throws SQLException
   */
  public String selectName(String code) throws SQLException {
    String name = null; // 氏名
    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE code = ?")) {
      // プレースホルダへの値の設定
      pstmt.setString(1, code);
      // SQLステートメントの実行
      ResultSet res = pstmt.executeQuery();
      // 結果の操作
      if (res.next()) {
        name = res.getString("name");
      }
    }
    return name;
  }
  /**
   * 指定された部署に属する従業員の氏名のリストを返します。
   * @param section 部署
   * @return 従業員の氏名のリスト
   * @throws SQLException
   */
  public List<String> selectNameList(String section) throws SQLException {
    List<String> nameList = new ArrayList<String>(); // 氏名
    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE section = ?")) {
      // プレースホルダへの値の設定
      pstmt.setString(1, section);
      // SQLステートメントの実行
      ResultSet res = pstmt.executeQuery();
      // 結果の操作
      while (res.next()) {
        nameList.add(res.getString("name"));
      }
    }
    return nameList;
  }
  /**
   * 指定されたコードの従業員レコードを削除します。
   * @param code コード
   * @return 処理したレコード件数
   * @throws SQLException
   */
  public int delete(String code)throws SQLException {
    int count = 0; // 処理件数
    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt =
             con.prepareStatement("DELETE FROM m_employee WHERE code = ?")) {
      // プレースホルダへの値の設定
      pstmt.setString(1, code);
      // SQLステートメントの実行
      count = pstmt.executeUpdate();
    }
    return count;
  }
}
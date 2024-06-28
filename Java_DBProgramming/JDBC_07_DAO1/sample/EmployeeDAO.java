/*
 * JDBC_07_DAO1
 * sample.EmployeeDAO.java
 */
package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * m_employeeテーブルのDAOです。
 * @author emBex Education
 */
public class EmployeeDAO {

  /**
   * 指定されたコードから従業員の氏名を検索して返します
   * @param code 従業員のコード
   * @return 従業員の氏名
   * @throws SQLException
   */
  public String selectName(String code) throws SQLException {

    String name = null; // 氏名

    // URL・ユーザ名・パスワードの設定
    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "embexU";
    String password = "embexP";

    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = DriverManager.getConnection(url, user, password);
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

    // URL・ユーザ名・パスワードの設定
    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "embexU";
    String password = "embexP";

    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = DriverManager.getConnection(url, user, password);
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
    // URL・ユーザ名・パスワードの設定
    String url = "jdbc:mysql://localhost:3306/sampledb";
    String user = "embexU";
    String password = "embexP";
    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = DriverManager.getConnection(url, user, password);
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
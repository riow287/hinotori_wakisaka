package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * m_employeeテーブルのDAOです。
 * @author name
 */
public class EmployeeDAO {
  /**
   * 特定の年齢層の従業員の氏名のリストを返します。
   * @param minAge 年齢の最小値
   * @param maxAge 年齢の最大値
   * @return 従業員の氏名のリスト
   * @throws SQLException
   */
  public List<String> selectName(int minAge, int maxAge) throws SQLException {

    List<String> nameList = new ArrayList<String>(); // 氏名

    // データベースへの接続の取得、PreparedStatementの取得
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE age BETWEEN ? AND ?")) {

      // プレースホルダへの値の設定
      pstmt.setInt(1, minAge);
      pstmt.setInt(2, maxAge);

      // SQLステートメントの実行
      ResultSet res = pstmt.executeQuery();

      // 結果の操作
      while (res.next()) {
        nameList.add(res.getString("name"));
      }
    }
    return nameList;
  }
}

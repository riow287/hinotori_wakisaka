package ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployee {

  /**
   * コマンドライン引数で指定した年齢以上の従業員情報を表示する
   * @param args 年齢
   */
  public static void main(String[] args) {
    /* データベースURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";
    /* データベースのユーザとパスワード*/
    String user = "embexU";
    String password = "embexP";

    String sql = "SELECT * FROM m_employee WHERE age >= ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = con.prepareStatement(sql)) {

      if (args.length != 1) {
        System.out.println(
            "不正な引数：コマンドライン引数で年齢を指定してください。");
        return;
      }

      int age;
      try {
        age = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("不正な引数：年齢は整数値で指定してください。");
        return;
      }

      preparedStatement.setInt(1, age);

      ResultSet res = preparedStatement.executeQuery();

      int count = 0;
      while (res.next()) {
        System.out.println("code:" + res.getString("code") +
                           " name:" + res.getString("name") +
                           " age: " + res.getInt("age") +
                           " section: " + res.getString("section"));
        count++;
      }

      System.out.println("年齢が" + age + "歳以上の従業員は、" + count +
                         "名です。");

    } catch (SQLException e) {
      System.out.println("処理結果：異常が発生しました。");
      e.printStackTrace();
    }
  }
}
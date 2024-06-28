package ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployee {

  /**
   * �R�}���h���C�������Ŏw�肵���N��ȏ�̏]�ƈ�����\������
   * @param args �N��
   */
  public static void main(String[] args) {
    /* �f�[�^�x�[�XURL */
    String url = "jdbc:mysql://localhost:3306/sampledb";
    /* �f�[�^�x�[�X�̃��[�U�ƃp�X���[�h*/
    String user = "embexU";
    String password = "embexP";

    String sql = "SELECT * FROM m_employee WHERE age >= ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = con.prepareStatement(sql)) {

      if (args.length != 1) {
        System.out.println(
            "�s���Ȉ����F�R�}���h���C�������ŔN����w�肵�Ă��������B");
        return;
      }

      int age;
      try {
        age = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("�s���Ȉ����F�N��͐����l�Ŏw�肵�Ă��������B");
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

      System.out.println("�N�" + age + "�Έȏ�̏]�ƈ��́A" + count +
                         "���ł��B");

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
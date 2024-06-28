/*
 * JDBC_02_DBConnection
 * sample.DBSample.java
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * データベースへの接続を行うサンプルプログラムです。
 * @author emBex Education
 */
public class DBSample {
	/**
	 * メインメソッド
	 * @param args この引数は使用しない。
	 */
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sampledb";

		String user = "sofdU";
		String password = "sofdP";

		try (Connection con = DriverManager.getConnection(url, user, password)){

			System.out.println("データベースに接続しました。");

		} catch (SQLException e) {
			System.out.println("処理結果：異常が発生しました。");
			e.printStackTrace();
		}
	}
}
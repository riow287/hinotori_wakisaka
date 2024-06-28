package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクションマネージャ
 * 
 * @author 
 */
public class ConnectionManager {
	/**
	 * データベースURL
	 */
	private final static String URL = "jdbc:mysql://localhost:3306/user_db";
	/**
	 * ユーザ
	 */
	private final static String USER = "embexU";
	/**
	 * パスワード
	 */
	private final static String PASSWORD = "embexP";

	/**
	 * データベースへの接続を取得して返します。
	 *
	 * @return コネクション
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
// JDBCドライバの読み込み
		System.out.println("a");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("b");
		return con;
	}
}
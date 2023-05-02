package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class select {

	public static void main(String[] args) {
		System.out.println("전체조회");

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			
			int num3 = 1;
			System.out.println("LANK\tID\tPW\tNAME");
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pw");
				String name = rs.getString(3);
				System.out.printf(num3++ +"\t%s\t%s\t%s%n", id, pw, name);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}

	}

}

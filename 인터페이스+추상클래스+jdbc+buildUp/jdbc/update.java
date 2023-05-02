package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 수정 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "update member set pw = ? where id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, pw);
			psmt.setString(2, id);

			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("비밀번호 변경 성공");
			} else {
				System.out.println("비밀번호 변경 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적 생성 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

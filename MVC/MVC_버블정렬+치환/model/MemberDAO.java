package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	
	ResultSet rs = null;
	boolean result;
	
	int cnt;

	public boolean login(String id, String pw) {
		connect();

		try {
			String sql = "select * from membership where id =? and pw=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if (rs.next() == true) {
				result = true;
			} else {
				result = false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
		return result;

	}

	public int insert(MemberDTO dto) {
		connect();
		String id =dto.getId();
		String pw = dto.getPw();
		try {
			String sql = "insert into membership (id,pw) values(?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
//			System.out.println("sql문 작동 실패");
			e.printStackTrace();
		}
		close();
		return cnt;
	}

	private void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
			
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}

}

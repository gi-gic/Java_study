package model;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO : Data Access Object
//membership 테이블과 데이터를 주고 받는 테이블

public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result;

	// 1. 로그인
	public boolean login(String id, String pw) {
		connect();

		try {
			String sql = "select * from membership where id = ? and pw = ?";
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

	// 2. 회원가입
	public int insert(MemberDTO dto) {

		// 1. JDBC 동적로딩
		connect();

		// 3. sql문 작성 및 전송
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();
			int age = dto.getAge();

			String sql = "insert into membership values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("sql문 작동 실패");
		}
		// 4. 종료
		close();
		return cnt;

	}

	// 3. 정보수정
	public int update(MemberDTO dto) {
		connect();

		String id = dto.getId();
		String pw = dto.getPw();

		try {
			String sql = "update membership set pw = ? where id =?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, pw);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();// cnt 이거 마지막 트라이캐치문에서 잡아내려고 하는겅미

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
		return cnt;
	}

	// 4. 조회
	public void select(String id) {
		connect();

		try {
			String sql = "select * from membership where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				System.out.println("ID\tPW\tNICK\tAGE");

				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%s\t%s\t%s\t%d%n", id2, pw, nick, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		close();
	}

	// 전체조회

	public void selectAll() {
		connect();

		try {
			String sql = "select * from membership";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			System.out.println("ID\tPW\tNICK\tAGE");
			while (rs.next()) {
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%s\t%s\t%s\t%d%n", id2, pw, nick, age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
	}

	// 5. 회원 탈퇴
	public int secession(MemberDTO dto) {

		connect();

		String id = dto.getId();
		String pw = dto.getPw();

		try {
			String sql = "delete from membership where id = ? and pw = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
		return cnt;
	}

	// 그냥 종료
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
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

	// 그냥 연결
	private void connect() {
		try {
			// 1. JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			conn = DriverManager.getConnection(url, id, pw);

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");

		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}

}

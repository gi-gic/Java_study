package controller;

import model.MemberDAO;
import model.MemberDTO;

public class ManagementSystem {

	MemberDAO dao = new MemberDAO();
	MemberDTO dto = new MemberDTO(null, null);

	public void loginCon(String id, String pw) {
		boolean result = dao.login(id, pw);

		if (result) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}

	public void insertCon(String id, String pw) {
		dto = new MemberDTO(id, pw);

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

}

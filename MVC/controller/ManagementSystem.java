package controller;

import model.MemberDAO;
import model.MemberDTO;

// Controller의 역할
// 사용자가 요청한 / 입력한 값이 있으면 controller에서 DAO로 연결시켜준다.
// 조금더 view를 간단하게, 사용자가 view에서 입력값과 결과값만 볼 수 있게 하도록 한다.

public class ManagementSystem {

	MemberDAO dao = new MemberDAO();
	MemberDTO dto = new MemberDTO(null, null, null, 0);

	public void loginCon(String id, String pw) {
		boolean result = dao.login(id, pw);

		if (result) {// == true) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}

	public void insertCon(String id, String pw, String nick, int age) {
		dto = new MemberDTO(id, pw, nick, age);

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public void updateCon(String id, String pw) {
		dto = new MemberDTO(id, pw);

		int cnt = dao.update(dto);
		if (cnt > 0) {
			System.out.println("비밀번호 수정 완료");
		} else {
			System.out.println("비밀정보 수정 실패");
		}
	}

	public void secessionCon(String id, String pw) {
		dto = new MemberDTO(id, pw);

		int cnt = dao.secession(dto);
		if (cnt > 0) {
			System.out.println("회원 탈퇴 성공");
		} else {
			System.out.println("회원 탈퇴 실패");
		}
	}
	
}

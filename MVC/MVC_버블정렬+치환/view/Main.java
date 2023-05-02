package view;

import java.util.Scanner;

import controller.ManagementSystem;
import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDTO dto =null;
		MemberDAO dao = new MemberDAO();
		ManagementSystem ms = new ManagementSystem();
		
		System.out.print("[1]로그인 [2]회원가입 >> ");
		int menu = sc.nextInt();
		
		if (menu == 1) {
			//로그인
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			
			ms.loginCon(id, pw);
			
			
		}else if(menu ==2) {
			//회원가입
			
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			
//			ms.insertCon(id, pw);
			dto = new MemberDTO(id, pw);

			int cnt = dao.insert(dto);

			if (cnt > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
			
		}
	}

}

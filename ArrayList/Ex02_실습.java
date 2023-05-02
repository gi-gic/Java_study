import java.lang.reflect.Array;

import java.util.ArrayList;

import java.util.Scanner;

public class Ex02_실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> team = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요 : ");
			team.add(sc.next());
		}
		System.out.print("연구 개발 팀의 이름은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다");

		// 팀원 탈퇴 시키기~
		// 내가 입력한 이름이 있을 경우 해당 이름 삭제하고 나머지 팀원 출력

		System.out.print("탈퇴 시킬 팀원 : ");
		String delete = sc.next();
		for (int i = 0; i < team.size(); i++) {
			if (delete.equals(team.get(i))) {
				team.remove(i);
			}
		}

		System.out.print("연구 개발 팀의 이름은 ");
		for (int j = 0; j < team.size(); j++) {
			System.out.print(team.get(j) + " ");
		}
		System.out.println("입니다");
	}

}

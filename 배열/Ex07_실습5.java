package ex1104;

import java.util.Scanner;

public class Ex02_실습5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] team = { "이도여", "김준연", "이현수", "김시우", "장예슬" };

		System.out.print("이름 : ");
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.println(team[i] + "님은 " + +(i + 1) + "번 인덱스에 있습니다.");
			}
		}
	}
}

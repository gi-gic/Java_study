package 반복문;

import java.util.Scanner;

public class Ex06_do_while문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pw; // 현재몸무게
		int gw; // 목표몸무게
		int ww; // 주차별 감량 몸무게
		int cnt = 0; // 주차를 카운트

		System.out.print("현재 몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		gw = sc.nextInt();

		do {
			System.out.print(++cnt + "주차 감량 몸무게 : ");
			ww = sc.nextInt();
			pw = pw - ww;
			
		} while (pw > gw);
		System.out.println(pw + "kg 달성!! 축하합니다!");

	}

}

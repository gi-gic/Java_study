package 반복문;

import java.util.Scanner;

public class Ex01_while문 {

	public static void main(String[] args) {
//		정수 입력 받기
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			if (num > 10) {
				System.out.println("종료되었습니다.");
				break; // > 쓸 수 있는 이유는 반복문 안에 들어있기 때문이다.
				//while문은 원래 break;를 못씀
			}
		}
	}
}

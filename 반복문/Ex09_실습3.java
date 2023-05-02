package 반복문;

import java.util.Scanner;

public class Ex09_실습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String an2;

		while (true) {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기 >> ");
			int an = sc.nextInt();

			if (an == 1) {
				System.out.println("더하기 연산 결과는 " + (num1 + num2) + "입니다.");
			} else if (an == 2) {
				System.out.println("빼기 연산 결과는 " + (num1 - num2) + "입니다.");
			}
			System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
			an2 = sc.next();

			if (an2.equals("N")) {
				System.out.println("종료합니다.");
				break;
			} else if (an2.equals("Y")) {
			} else {
				System.out.println("다시 입력해 주십시오.");
				while (true) {
					System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
					an2 = sc.next();
					if (an2.equals("Y")) {
						break;
					}else if (an2.equals("N")) {
						System.out.println("종료합니다");
						System.exit(an);
					}else {
						System.out.println("다시 입력해 주십시오.");
					}
				}
			}
		}
	}
}
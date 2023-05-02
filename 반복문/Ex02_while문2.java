package 반복문;

import java.util.Scanner;

public class Ex02_while문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			sum = sum + num;

			System.out.println("누적 결과 : " + sum);
			
//			if (num<0) {
//				System.out.println("종료되었습니다");
//				break;
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			}
		}
	}

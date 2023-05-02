package 조건문;

import java.util.Scanner;

public class Ex01_단순if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num > 10) {
			System.out.println("10보다 큽니다");
		}

		System.out.println("프로그램 종료");
	}
	

}

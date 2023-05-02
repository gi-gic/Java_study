package 반복문;

import java.util.Scanner;

public class Ex03_while문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0; // 짝수
		int odd = 0; // 홀수

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else if (num % 2 == 0) {
				System.out.println("짝수 개수 : " + ++even);
				System.out.println("홀수 개수 : " + odd);
			} else {
				System.out.println("짝수 개수 : " + even);
				System.out.println("홀수 개수 : " + ++odd);
			}
		}
	}
}

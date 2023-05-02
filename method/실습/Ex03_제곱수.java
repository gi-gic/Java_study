package ex1109;

import java.util.Scanner;

public class Ex03_제곱수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("밑 입력 : ");
		int base = sc.nextInt();
		System.out.print("지수 입력 : ");
		int n = sc.nextInt();
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	public static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result = result * base;
		}
		return result;
	}
}
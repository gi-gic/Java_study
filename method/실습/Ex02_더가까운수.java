package ex1109;

import java.util.Scanner;

public class Ex02_더가까운수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 " + result);
	}

	public static int close10(int num1, int num2) {
		
		int a = Math.abs(10 - num1);
		int b = Math.abs(10 - num2);
		
//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		if (a < 0) {
//			a *= -1;
//		}
//		if (b < 0) {
//			b *= -1;
//		}
		
		if (a < b) {
			return num1;
		} else if (a > b) {
			return num2;
		} else {
			return 0;
		}
	}
}

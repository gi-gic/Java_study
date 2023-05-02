package ex1109;

import java.util.Scanner;

public class Ex04_약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		System.out.println(num2 + "가");
		int num1 = sc.nextInt();
		System.out.println(num1 + "의 약수인가?");
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result;
		if (num1 % num2 == 0) {
			result = num1 % num2 == 0;
		} else {
			result = num1 % num2 == 0;
		}
		return result;

	}

}

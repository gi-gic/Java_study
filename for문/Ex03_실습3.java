package for문;

import java.util.Scanner;

public class Ex03_실습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		int sum = 0;

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++)
				sum = i + sum;
			System.out.println("총 합 : " + sum);
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++)
				sum = i + sum;
			System.out.println("총 합 : " + sum);
		}
	}
}
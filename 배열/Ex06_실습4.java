package ex1104;

import java.util.Scanner;

public class Ex01_실습4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		// 입력
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			array[i] = sc.nextInt();
		}
		//입력된 정수 출력
		System.out.print("입력된 점수 : ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		System.out.print("최고 점수 : ");
		int max = array[0];
		for (int d = 0; d < array.length; d++) {
			if (max < array[d]) {
				max = array[d];
			}
		}
		System.out.println(max);
		System.out.print("최저 점수 : ");
		int min = array[0];
		for (int k = 0; k < array.length; k++) {
			if (min > array[k]) {
				min = array[k];
			}
		}
		System.out.println(min);
		int plus = 0;
		for (int p = 0; p < array.length; p++) {
			plus = array[p] + plus;
		}
		System.out.println("점수 총합 : " + plus);
		System.out.println("점수 평균 : " + (double)plus / array.length);

	}
}
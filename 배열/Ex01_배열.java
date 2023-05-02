package ex1103;

import java.util.Scanner;

public class Ex01_배열 {

	public static void main(String[] args) {

//		변수 선언
		int a;

//		변수 초기화
		a = 5; // int a = 5

//		배열 선언
		int[] intArray;

//		배열 생성
		intArray = new int[5];
//		int[] int Array = new int [5]
		System.out.println(a);
		System.out.println(intArray);

		System.out.print(intArray[0]);
		System.out.print(intArray[1]);
		System.out.print(intArray[2]);
		System.out.print(intArray[3]);
		System.out.println(intArray[4]);

		System.out.println("===========");

		intArray[0] = 5;
		intArray[1] = 4;
		intArray[2] = 3;
		intArray[3] = 2;
		intArray[4] = 1;

		System.out.print(intArray[0]);
		System.out.print(intArray[1]);
		System.out.print(intArray[2]);
		System.out.print(intArray[3]);
		System.out.println(intArray[4]);

		System.out.println("===========");

//		for문을 이용해 데이터 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

//		배열의 크기 : .length

		System.out.println("intArray의 크기 : " + intArray.length);

//		선언과 동시에 초기화
//		배열에 들어갈 값을 정확히 알고 있을 때

		int[] intArray2 = { 4, 8, 12, 6 };
		System.out.println("intArray2의 크기 : " + intArray2.length);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i] + " ");
		}

//		new : 생성할 때 쓰는 키워드 
		Scanner sc = new Scanner(System.in);
		// 데이터 타입↑__|

		String name = new String("장예슬");
		String name1 = "장예슬2";
		// 레퍼런스 타입↑__|

	}
}

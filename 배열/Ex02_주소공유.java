package ex1103;

public class Ex02_주소공유 {

	public static void main(String[] args) {

		// 배열 -> 레퍼런스 변수 -> 주소값 저장
		// 주소를 공유 -> 같은 공간을 공유

		int[] intArray = new int[5];
		int[] myArray = intArray;

		System.out.println(intArray + ", " + myArray);

		intArray[1] = 5;

		System.out.println(intArray[1]);
		System.out.println(myArray[1]);

		myArray[1] = 10;

		System.out.println(intArray[1]);
		System.out.println(myArray[1]);
	}

}

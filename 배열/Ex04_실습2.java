package ex1103;

public class Ex04_실습2 {

	public static void main(String[] args) {

		int cnt = 0;

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("intArray에 들어있는 홀수는 ");

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 1) { // intArray에서 홀수만 걸러내는 작업
				System.out.print(intArray[i] + " "); // 홀수인 애만 출력
				cnt++; // if가 true가 나올 때만 cnt가 올라감 > 홀수 적립하기 위해 만들어진 int cnt = 0;
			}
		} System.out.println("입니다. " + "홀수의 총 개수는 " + cnt + "입니다.");
	}
}
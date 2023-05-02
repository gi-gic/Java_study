package method;

import java.util.Scanner;

public class Ex05_계산기 {

	public static void main(String[] args) {
//		사용자로부터 숫자 2개, 연산자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 (+,-,*,/) >> ");
		String op = sc.next();

		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, String op) {
		//return은 한번만 쓸 수 있음 -> 하나의 조건에 의해서 실행
		//else에 대한 리턴값을 줘야함
		if (op.equals("+")) {
			return num1 + num2;
		} else if (op.equals("-")) {
			return num1 - num2;
		} else if (op.equals("*")) {
			return num1 * num2;
		} else if (op.equals("/")) {
			return num1 / num2;
		} else {
			return 0;
		}
	}
}
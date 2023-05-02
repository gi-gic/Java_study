package ex1028;

public class Ex07_형변환2 {

	public static void main(String[] args) {

		byte num1 = 3; // -128 ~ 127
		int num2 = 8000;

		num1 = (byte) num2;
		System.out.println(num1);
		// 8000/256 = 31 ... 64

		int num3 = 128; // 256씩 더하기
		num1 = (byte) num3;
		System.out.println(num1);
//		값이 양의 방향으로 넘어가는 현상 : Overflow

		int num4 = -129;
		num1 = (byte) num4;
		System.out.println(num1);
//		값이 음의 방향으로 넘어가는 현상 : Underflow

//		
		int num5 = 30000;
		short num6 = 0;

		num6 = (short) num5; // 들어있는 값과는 상관없음, 자료형이 일치해야한다. ->명시적 형변환이 되어야함

	}

}

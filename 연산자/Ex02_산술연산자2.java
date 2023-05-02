
public class Ex02_산술연산자2 {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3;

		System.out.println(num1 + num2);

		String str1 = "7";
		String str2 = "3";

//		문자열끼리는 더하는 연산이 가능하다
		System.out.println(str1 + str2);

		String last_name = "장";
		String first_name = "예슬";

		System.out.println(last_name + first_name);

//		문자열 + 정수 -> 문자열
//		JAVA에서는 문자열 + 정수 연산이 가능
//		문자열로 자동형변환(묵시적형변환)이 일어난다
		System.out.println(7 + 3 + "7");
		System.out.println(7 + "3" + 7);
		System.out.println("7" + 3 + 7);
	}

}

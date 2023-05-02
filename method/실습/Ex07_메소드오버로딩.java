package ex1109;

public class Ex07_메소드오버로딩 {

	public static void main(String[] args) {
//		메소드 오버로딩 :  중복정의
//		1. 메소드 이름은 동일해야 함
//		2. 매개변수의 개수 및 데이터 타입을 다르게 해서 구별

		add(3, 5);
		add(5, 2.8);
		add(4, 3.4, 6.5);
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, double b) {
		System.out.println(a + b);
	}

	public static void add(int a, double b, double c) {
		System.out.println(a + b + c);
	}

}

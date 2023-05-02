package ex1028;

public class Ex04_변수2 {

	public static void main(String[] args) {

//		선언하는 부분과 초기화하는 부분이 붙어있음
		int num = 100;

		// 1. 변수 선언
		int a;

//		 2. 변수 초기화(맨 첫번째의 할당)
		a = 50;
		System.out.println(a);

//		 3. 재할당
		a = 44;
		System.out.println(a);

//		 상수 만들기 : 변하지 않는 수
		final int PI = 3;
//		PI = 5; -> 상수이기 때문에 재할당 불가

		int 나이 = 20;
		System.out.println(나이);
//		"나이"라고 쓰지 않아도 됨

//		 필수적으로 지켜야하는 규칙
//		1. 키워드 사용 불가
//		2. 대소문자 구분 가능, 제한길이 X
//		3. 특수문자 _와 $만 가능
//		
//		 관습적으로 지켜야하는 규칙
//		1. 클래스의 이름은 대문자로 시작
//		2. 변수의 시작은 소문자로 시작
//		3. 패키지는 소문자로 시작
//		4. 여러 단어로 이루어져 있는 경우
//		4-1. 띄어쓰기 대신 _ 사용
//		4-2. 다음 단어의 첫글자를 대문자로 사용

	}

}

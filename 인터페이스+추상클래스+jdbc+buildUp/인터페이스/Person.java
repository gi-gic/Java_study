package 인터페이스;

public interface Person {
	// 인터페이스는 프로젝트가 시작될 때
	// 필요한 기능들을 미리 정의하고 시작하는 기능!
	// --> 추상클래스보다 먼저 만들어지는 최초의 설계도

	// 인터페이스 역시 객체 생성이 불가능하다

	// 변수 -> 상수 값만 올 수 있다!
	final int eyes = 2;
	double num1 = 0;
	int num2 = 13; // --> final 생략 --> public static final

	// 메서드 -> 추상 메서드만 올 수 있다!
	void sleep(); // abstract 생략 --> public abstract 생략가능~
}
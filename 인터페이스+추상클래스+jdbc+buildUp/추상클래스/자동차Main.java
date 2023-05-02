package 추상클래스;

public class 자동차Main {

	public static void main(String[] args) {
		휘발유자동차 c1 = new 휘발유자동차();
		전기자동차 c2 = new 전기자동차();
		수소자동차 c3 = new 수소자동차();

		c1.run();
		c2.run();
		c3.run();

		c1.name = "스포티지";
		c2.name = "wjsrl";
		c3.name = "넥소";
		c1.print();
		c3.print();

//		추상클래스는 기본적으로 객체생성이 불가능하다!!
//		왜 --> 추상클래스는 구현하지 않은 부분도 있을 수 있기 때문
		// (ex. 추상메소드)
	}
}

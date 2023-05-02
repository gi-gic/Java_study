package 인터페이스;

public class 승환Person implements Person, Person2 {

	// 인터페이스를 상속받을 때는 implements라는 키워드를 사용한다.
	// 인터페이스 상속은 다중 상속이 가능하다
	
	@Override
	public void sleep() {
		System.out.println("엎드려서 잠을 잔다");
	}
	
	@Override
	public void eat() {
		System.out.println("밥을 먹는다");
	}

}

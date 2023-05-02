package ood;

public class Person {

//	우리가 창조주가 되어서 원하는 사람을 만들 수 있는 설계도(class)
//	클래스의 구조
//	필드 - 속성, 특징
//	ㄴ 키, 나이, 이름 ...
	String name;
	int age;
	int height;

//	생성자 메소드 
//	1. 리턴 타입 없음
//	2. 메소드 이름이 클래스 이름과 동일
//	3. 생성자는 new 키워드를 통해서만 이루어짐. 객체를 생성할 때마다 new 키워드 사용
	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

//	기본(디폴트) 생성자 메소드
//	생성자가 없는 클래스는 안한다
//	하나 이상의 생성자 메소드를 만들면 기본 생성자는 없어진다
	public Person() {
	}

	// 메소드 - 기능, 행동, 행위
//	ㄴ 코딩하기, 생각하기...
//	main()가 없는 곳에서 메소드를 생성할 때
//	static 키워드 제외
	public void coading() {
		System.out.println("코딩 너무 재밌다 ㅋㅋ");
	}

	public void think() {
		System.out.println("곰니");
	}
}

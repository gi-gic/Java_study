package ood;

public class PersonMain {

	public static void main(String[] args) {

//		Person 설계도 클래스를 이용해서 실제 사람 (객체)이 만들어지는 클래스

//		1. 사람(객체) 생성하기
		int a = 5;
		String b = "?";

		Person p1 = new Person(); // -> 데이터 타입은 person
		Person p2 = new Person();
		Person p3 = new Person("박인성", 19, 500);

		p1.name = "장예슬";
		p1.age = 26;
		p1.height = 172;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);

		p1.name = "잘례슬";
		System.out.println(p1.name);

		p2.name = "이경영";
		p2.age = 200;
		p2.height = 182;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);

		p1.coading();
		p1.think();

		p2.coading();
		p2.think();
	}
}

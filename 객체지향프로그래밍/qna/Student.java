package qna;

public class Student {

	//필드
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	//생성자 메소드
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		//this : 자기 자신의 객체, 현재 실행되는 메소드가 속한 객체
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public void Show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[" + number + ", " + age +"살]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android 점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("=====================================");
		
		
	}
}
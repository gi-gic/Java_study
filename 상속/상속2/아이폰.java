package 상속2;

public class 아이폰 extends 스마트폰{
	
	public void camera() {
		System.out.println("사진찍기");
	}
	
	// 오버라이딩 (재정의)
	//매개변수, 데이터 타입도 똑같아야함
	@Override
	public void call() {
		System.out.println("영상통화");
	}
	
}

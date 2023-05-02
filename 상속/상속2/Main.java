package 상속2;

public class Main {

	public static void main(String[] args) {
		전화 phone = new 전화();
		스마트폰 smart = new 스마트폰();
		아이폰 iphone =new 아이폰();
		
		phone.call();
		phone.answer();
		
		smart.music();
		smart.internet();
		
		iphone.camera();
		iphone.call(); // 오버라이딩
		
		System.out.println("아무거나\r아무거나");
		
	}

}

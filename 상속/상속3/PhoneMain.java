package 상속3;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.call();

		Lollipop p2 = new Lollipop();
		p2.Message();
		p2.call(); // -> 오버라이딩해서 재정의했으니까 다르게 나옴

		// 업캐스팅 -> 상위클래스 객체명 = 하위클래스 객체명
		// 상위클래스에 있는 기능만 사용할 수 있다!
		// ★★★★★단!!! 업캐스팅을 했을때 하위클래스에서 이미 오버라이딩(재정의)
		// 해준 경우는 업캐스팅 하더라도 재정의한 기능이 사용되어진다.
		
		Phone p3 = p2;
//		p3.Message(); -> 사용할 수 없게 되어진다
		p3.call(); // ? '폴더를 열어서 전화를 걸다'
		p3.send();

	}
}
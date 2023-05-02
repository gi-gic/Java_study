package 상속4;

public class SnackMain {

	public static void main(String[] args) {

		SunChip sun = new SunChip();
		eat(sun);

		Honey hon = new Honey();
		eat(hon);

		YacheTime ya = new YacheTime();
		eat(ya);

		SwingChip sw = new SwingChip();
		eat(sw);//스윙칩을 먹습니다~

	}

	// 메인이 있는 곳에서는 static 키워드를 사용해야함

	public static void eat(Snack snack) {
		// 만약 먹는 과자가 야채타임이라면 케찹을 찍어 먹고 싶음
		// --->야채타임으로부터 업캐스팅 된 객체라면!
		snack.eat();
		if (snack instanceof YacheTime) {
			// 다운캐스팅을 해서
			// 하위클래스명 객체명 = (하위클래스명) 업캐스팅된 객체명
			YacheTime ya = (YacheTime) snack;
			// 케찹찍기
			ya.ketchup();
		}

	}

//	public static void eat(SunChip sun) {
//		sun.eat();
//	}
//
//	public static void eat(Honey hon) {
//		hon.eat();
//	}
//
//	public static void eat(YacheTime ya) {
//		ya.eat();
//	}

}

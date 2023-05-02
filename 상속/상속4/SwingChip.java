package 상속4;

public class SwingChip extends Snack{
	
	@Override
	public void eat() {
		System.out.println("스윙칩을 먹다");
	}
//	Snack에서 물려준 eat라는 기능을 반드시
//	오버라이딩(재정의) 해줘야만 한다.
}

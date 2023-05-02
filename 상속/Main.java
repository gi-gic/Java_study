package 상속;

public class Main {

	public static void main(String[] args) {

		마우스 ms = new 마우스();
		휠마우스 wheel = new 휠마우스();
		인체공학마우스 es = new 인체공학마우스();
		ms.drag();
		ms.leftclick();
		ms.rightclick();

		wheel.drag();
		wheel.leftclick();
		wheel.rightclick();
		wheel.scroll();
		
		es.ergonomics();

	}

}

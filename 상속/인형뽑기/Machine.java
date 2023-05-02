package 인형뽑기;

public class Machine {

	// 뽑기 기능 필요

	// 파이리 인형뽑기 기능
	public void pickPiri(Piri piri) {
		piri.pick();
	}

	// 꼬부기 인형뽑기 기능
	public void pickKkobuck(Kkobuck kkobuck) {
		kkobuck.pick();
	}

	// 피카츄 인형뽑기 기능
	public void pickPika(Pika pika) {
		pika.pick();
	}

	public void pickRaichu(Raichu raichu) {
		raichu.pick();
	}
	// 메소드 이름을 그대로 유지한 채로
			// 다른 매개변수를 받아서 새로운 메소드를 만드는 기능!
			// --> 메소드 오버로딩 : 다형성
	
	public void pickPokect(Pocket pocket) {
		pocket.pick();
	}
}

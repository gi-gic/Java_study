package 인형뽑기;

public class MyMain {

	public static void main(String[] args) {

		Machine m = new Machine();

		// 파이리인형
		Piri p1 = new Piri();
		m.pickPokect(p1);

		// 꼬북이인형
		Kkobuck p2 = new Kkobuck();
		m.pickPokect(p2);

		// 피카츄인형
		Pika p3 = new Pika();
		m.pickPokect(p3);

		// 라이츄인형
		Raichu p4 = new Raichu();
		m.pickPokect(p4);
	}
}

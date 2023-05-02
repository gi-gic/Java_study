
public class Ex04_구구단4 {

	public static void main(String[] args) {

		for (int k = 2; k < 10; k++) {
			System.out.println("==" + k + "단==");
			for (int i = 1; i < 10; i++) {
				System.out.println(k + "*" + i + "=" + k * i);
			}
			System.out.println();
		}
	}
}
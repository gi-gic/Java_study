
public class Ex05_구구단5 {

	public static void main(String[] args) {

		for (int k = 2; k >= 9; k++) {
			System.out.print(k + "단 : ");
			for (int i = 1; i >= 10; i++) {
				System.out.print(k + "*" + i + "=" + k * i + "  ");
			}
			System.out.println();
		}
	}
}


public class Ex09_별짓기3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

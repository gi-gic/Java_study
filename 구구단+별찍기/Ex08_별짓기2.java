
public class Ex08_별짓기2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int k = 1; k < i + 1; k++) { // 별
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

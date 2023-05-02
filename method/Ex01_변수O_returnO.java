package method;

public class Ex01_변수O_returnO {

	public static void main(String[] args) {
		System.out.println(sum(2, 5));
		sum(2, 5);
	}

	public static int sum(int a, int b) {
		int result = a + b;

		return result;
	}
}

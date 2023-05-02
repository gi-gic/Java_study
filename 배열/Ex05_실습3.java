package ex1103;

public class Ex05_실습3 {

	public static void main(String[] args) {

		int[] intA = { 5, 2, 4, 8, 32, 1, 10 };

		// 최댓값
		int max = intA[0];
		System.out.print("가장 큰 수는 ");
		for (int i = 0; i < intA.length; i++) {
			if (max < intA[i]) {
				max = intA[i];
			}
		}
		System.out.println(max + "입니다.");

		// 최솟값
		int min = intA[0];
		System.out.print("가장 작은 수는 ");
		for (int i = 0; i < intA.length; i++) {
			if (min > intA[i]) {
				min = intA[i];
			}
		}
		System.out.println(min + "입니다.");
	}

}

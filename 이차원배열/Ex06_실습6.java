package 이차원배열;

public class Ex06_실습6 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int cnt = 1;

		// 입력부
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				array[i][k] = cnt++;
			}
		}
		// 출력부
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				if (i % 2 == 0) {
					System.out.print(array[i][k] + "\t");
				}else if (i%2==1) {
					System.out.print(array[i][4-k] + "\t");
				}
			}
			System.out.println();
		}
	}
}
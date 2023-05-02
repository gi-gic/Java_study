package 이차원배열;

public class Ex05_실습5 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int cnt = 21;
		
		// 입력부
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				array[i][k] = cnt++;
			}
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			for (int k = 4; k >= 0; k--) {
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
	}
}
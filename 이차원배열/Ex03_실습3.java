package 이차원배열;

public class Ex03_실습3 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int cnt = 1;
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
				System.out.print(array[k][i] + "\t");
			}
			System.out.println();
		}
	}
}

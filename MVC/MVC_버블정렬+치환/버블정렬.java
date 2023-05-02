import java.util.Random;

public class 버블정렬 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[10];

		// 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] = rd.nextInt(10));
		}
		System.out.println();

		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}

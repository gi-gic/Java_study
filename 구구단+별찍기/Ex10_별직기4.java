import java.util.Scanner;

public class Ex10_별직기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 별찍기 개수 입력 : ");
		int num = sc.nextInt();

		for (int k = 1; k <= num; k++) {

			for (int i = 1; i <= k; i++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
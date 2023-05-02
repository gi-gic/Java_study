import java.util.Scanner;

public class Ex02_구구단2 {

	public static void main(String[] args) {

//		내가 원하는 단 출력하기
		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 : ");
		int num = sc.nextInt();
//		for (int i = num; a <= 9; a++) {
//			System.out.println(i + "*" + a + "=" + i * a);
//		}
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + num * i);
		}

	}

}

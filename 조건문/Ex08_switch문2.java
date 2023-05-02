package 조건문;
import java.util.Scanner;

public class Ex08_switch문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇월인가요 : ");
		int month = sc.nextInt();
		switch (month) {
		case 12, 1, 2:
			//이런 것도 가능하다~~
			//case로 세줄로 바꿀 수 있음
			System.out.println("겨울");
			break;
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}

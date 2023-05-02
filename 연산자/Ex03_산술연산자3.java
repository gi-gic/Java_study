
import java.util.Scanner;

public class Ex03_산술연산자3 {

	public static void main(String[] args) {

//		변수 num 값을 입력했을 때 백의 자리 미만을 버리는 코드 짜보기
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

//		나머지를 이용
		System.out.println(num - num % 100);

//		몫을 이용
		System.out.println(num / 100 * 100);
		System.out.println(num / 100 + "00");

	}

}

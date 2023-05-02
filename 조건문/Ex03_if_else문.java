package 조건문;
import java.util.Scanner;

public class Ex03_if_else문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 정수 : ");
		int num = sc.nextInt();

//		삼항연산자
//		System.out.println (num % 2 == 0 ? "짝수" : "홀수")

		if (num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else {
			System.out.println(num + "는(은) 홀수입니다.");
		}

	}

}

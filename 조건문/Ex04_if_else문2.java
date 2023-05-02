package 조건문;
import java.util.Scanner;

public class Ex04_if_else문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		System.out.print("반올림 수 : ");
		if (num % 10 >= 5) {
			System.out.println((num - num % 10) + 10);
			//System.out.println(num/10*10+10);
		} else {
			System.out.println(num - num % 10);
			//System.out.println(num/10*10);
		}
	}

}

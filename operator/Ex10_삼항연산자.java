import java.util.Scanner;

public class Ex10_삼항연산자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();

		System.out.print(num1 > num2 ? true : false);
	}

}

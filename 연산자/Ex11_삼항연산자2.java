import java.util.Scanner;

public class Ex11_삼항연산자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
	}

}

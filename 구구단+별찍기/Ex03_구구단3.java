import java.util.Scanner;

public class Ex03_구구단3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단과 곱해지는 수를 입력받아서 구구단 작성");
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("곱해지는 수 입력 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i <= num2; i++) {
			System.out.println(num1 + "*" + i + "=" + num1 * i);
			
		}
	}

}

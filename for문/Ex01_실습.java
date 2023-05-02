package for문;

public class Ex01_실습 {

	public static void main(String[] args) {

//		for문을 이용하여 21부터 57까지 출력
//		for(초기화구문;조건;반복 후 작업){
//			조건이 true일 때 실행문;
//		}
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
//		for문을 이용하여 96부터 53까지 출력
		for (int a = 96; a >= 53; a--) {
			System.out.print(a + " ");
		}
		System.out.println();
//		for문을 이용하여 21부터 57중 홀수만 출력
		for (int b = 21; b <= 53; b++) {
			if (b % 2 == 1) {
				System.out.print(b + " ");
			}
//		System.out.println(b%2==1 ? i : " ");
		for (int b1 = 21 ; b1 <= 57; b1=b1+2 );
		}
	}
}

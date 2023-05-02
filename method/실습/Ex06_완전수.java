package ex1109;

public class Ex06_완전수 {

	public static void main(String[] args) {
//		약수를 나열했을 때 자기 자신의 빼고의 합이 자기 자신인 경우
//		 6-> 1, 2, 3, 6(자기자신)

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static void getPerfectNumber(int a, int b) {
		System.out.print(a + " ~ " + b + "의 완전수 : ");
		
		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++ ) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if(sum == i) {
				System.out.print(i + " ");
			}
		}
	}
}
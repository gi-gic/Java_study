package buildUp;

public class Ex02_ArrayOut {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };

		try {
			System.out.println(a[2]);
			System.out.println(100 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 에러");
//		} catch (ArithmeticException e) {
//			System.out.println("수학적인 에러");
		} catch (Exception e) {
			//어떤 예외사항을 잡아주지 못했을때 실행되는 것 
			e.printStackTrace();
		} finally {
			//예외상관없이 한번은 실행
			System.out.println("예외상관없이실행");
		}
		System.out.println("다음코드");
	}
}
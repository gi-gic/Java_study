package ex1028;

public class Ex06_형변환 {

	public static void main(String[] args) {

//		자동 형변환, 묵시적 형변환
		int num = 5;
		System.out.println(num);

		double num2 = num;
		System.out.println(num2);

//		강제 형변환, 명시적 형변환
		double num3 = 5.6;
		System.out.println(num3);

		int num4 = (int) num3;
		System.out.println(num4);

	}

}

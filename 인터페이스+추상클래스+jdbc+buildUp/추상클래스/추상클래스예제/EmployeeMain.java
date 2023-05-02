package 추상클래스예제;

public class EmployeeMain {

	public static void main(String[] args) {

		PartTimeEmployee pe = new PartTimeEmployee("001", "승환쌤", 100, 25);

		// 사번, 이름, 일당
		pe.println();
		// 월급여
		System.out.println(pe.getMoneyPay());

		System.out.println("==============");

		TempEmployee te = new TempEmployee("001", "주희쌤", 20);
		te.println();
		System.out.println(te.getMoneyPay());

		System.out.println("==============");

		RegularEmployee re = new RegularEmployee("002", "장예슬", 4000, 400);
		re.println();
		System.out.println(re.getMoneyPay() + "만원");
	}
}
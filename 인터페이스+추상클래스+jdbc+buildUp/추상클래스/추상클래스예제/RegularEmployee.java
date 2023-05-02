package 추상클래스예제;

public class RegularEmployee extends Employee {

	int bonus;

	@Override
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;

	}

}

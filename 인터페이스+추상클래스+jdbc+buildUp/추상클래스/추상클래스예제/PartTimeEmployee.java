package 추상클래스예제;

public class PartTimeEmployee extends Employee {

	// empno
	// name
	// pay
	
	int workDay; // 일수

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
}

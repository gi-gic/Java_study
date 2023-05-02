package 추상클래스예제;

public class TempEmployee extends Employee {

	// 연봉/12

	@Override
	public int getMoneyPay() {
		return pay / 12;
	}
	// print 정보를 출력시켜주는 역할 -> Employee 에서 물려받음

	// 생성자를 만들때는 void..이런거 없고 클래스 이름이랑 똑같아야함
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
}
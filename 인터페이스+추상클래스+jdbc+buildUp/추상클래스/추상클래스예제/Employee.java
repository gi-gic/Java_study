package 추상클래스예제;

public abstract class Employee{

	// 1. 사번, 이름, 연봉 or 시급

	String empno;
	String name;
	int pay;

	// 2. 월급을 계산하는 기능 getMoneyPay -> 추상메소드
	public abstract int getMoneyPay();

	public void println() {
		System.out.println(empno + " : " + name + ": " + pay);
	}
	
}

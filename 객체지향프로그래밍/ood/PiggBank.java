package ood;

public class PiggBank {
	// 저금통 클래스
	
	// 필드
	public // -> 생략되어있음 (현재)
	//private -> getter setter 
	int money;

	// 메소드

	// 1. 저금하는 메소드
	// 사용자가 입금할 돈을 입력하면 (매개변수) 현재 자산(money)에 추가

	public void deposit(int input) {
		money += input;
	}

	// 2. 출금하는 메소드
	// 사용자가 출근할 돈을 입력하면(매개변수) 현재 자산(money)에서 출금
	public void withdraw(int output) {
		money -= output;
	}

	// 3. 잔액을 보여주는 메소드
	// 현재 재산을 출력하는 메소드
	public void showMoney() {
		System.out.println("현재 잔액 (●'◡'●) " + money);
	}
}
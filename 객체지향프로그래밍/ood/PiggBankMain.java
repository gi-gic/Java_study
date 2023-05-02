package ood;

public class PiggBankMain {

	public static void main(String[] args) {
		
		//저금통 설계도 불러오기
		PiggBank pig1 = new PiggBank();
		pig1.deposit(1500);
		pig1.showMoney();
		pig1.deposit(700);
		pig1.showMoney();
		pig1.withdraw(500);
		pig1.showMoney();
		
	}

}

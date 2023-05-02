package 조건문;
import java.util.Scanner;

public class Ex07_switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선풍기 풍속을 조절합니다.");
		System.out.println("1번 : 약, 2번 : 중, 3번 : 강");
		
		System.out.print("선택한 번호 : ");
		int fan = sc.nextInt();
		
		switch (fan) {
		case 1 :
			System.out.println("약한 바람이 나옵니다.");
			break;
		case 2 :
			System.out.println("중간 바람이 나옵니다.");
			break;
		case 3 :
			System.out.println("강한 바람이 나옵니다.");
			break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			break;

		}
		
	}

}

package 조건문;
import java.util.Scanner;

public class Ex10_가위바위보다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user2 : ");
		String user2 = sc.next();

		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next();
		System.out.print(user2 + "님 >> ");
		String rsp2 = sc.next();
		
//		String(문자열)을 같다고 비교할 때 -> .equals()를 사용한다.
//		비교할 문자열1.equals(비교할문자열2)
		
		if(rsp1.equals(rsp2)) {
			System.out.println("무승부");
			
		}else if (rsp1.equals("가위")) {

			if(rsp2.equals("보")) {
				System.out.println(user1+"님 승리!");
			}else if (rsp2.equals("바위")){
				System.out.println(user2+"님 승리!");
			}
			
		}else if (rsp1.equals("바위")) {
			
			if(rsp2.equals("가위")) {
				System.out.println(user1+"님 승리!");
			}else if(rsp2.equals("보")){
				System.out.println(user2+"님 승리!");
			}
			
		}else if (rsp1.equals("보")) {
			if(rsp2.equals("바위")) {
				System.out.println(user1+"님 승리!");
			}else if (rsp2.equals("가위")) {
				System.out.println(user2+"님 승리!");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}

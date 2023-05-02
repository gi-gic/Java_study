package 조건문;
import java.util.Scanner;

public class 그냥해본거 {

	public static void main(String[] args) {

//		왜안됐을까?

//		switch (rsp) {
//		case "가위" : 
//			if (rsp2.equals("바위")) {
//				System.out.println(user2+"님 승리!");
//			}else if (rsp2.equals("보")) {
//				System.out.println(user1+"님 승리!");
//			}
//			break;
//		case "바위" :
//			if (rsp2.equals("가위")) {
//				System.out.println(user1+"님 승리!");
//			}else if (rsp2.equals("보")) {
//				System.out.println(user2+"님 승리!");
//			}
//			break;
//		case "보" :
//			if (rsp2.equals("가위")) {
//				System.out.println(user2+"님 승리!");
//			}else if (rsp2.equals("바위")) {
//				System.out.println(user1+"님 승리!");
//			}
//			break;
//			default: System.out.println("무승부!");
		
		//수정한게 돌아가는 걸 봐선 if문에서 ==를 썼기 때문...
		//근데 식 복잡하기만 하고 별로인듯 

		Scanner sc = new Scanner(System.in);

		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user2 : ");
		String user2 = sc.next();

		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next();
		System.out.print(user2 + "님 >> ");
		String rsp2 = sc.next();

		switch (rsp1) {
		case "가위" : 
			if (rsp2.equals("바위")) {
				System.out.println(user2+"님 승리!");
			}else if (rsp2.equals("보")) {
				System.out.println(user1+"님 승리!");
			}
			break;
		case "바위" :
			if (rsp2.equals("가위")) {
				System.out.println(user1+"님 승리!");
			}else if (rsp2.equals("보")) {
				System.out.println(user2+"님 승리!");
			}
			break;
		case "보" :
			if (rsp2.equals("가위")) {
				System.out.println(user2+"님 승리!");
			}else if (rsp2.equals("바위")) {
				System.out.println(user1+"님 승리!");
			}
			break;
			default: System.out.println("무승부!");
		}
	}

}

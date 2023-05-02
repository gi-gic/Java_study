import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>();

		System.out.println("====Music Play List====");
//		musiclist.add(1,5);
		while (true) {
			System.out.print("[1] 음악 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=======================");
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("원하는 위치 입력 : ");
					int index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					ml.add(index - 1, title);
					System.out.println("추가가 완료되었습니다.");
				} else if (num == 2) {
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					ml.add(title);
					System.out.println("추가가 완료되었습니다.");
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} else if (menu == 2) {
				if (ml.size() == 0) {
					System.out.println("======현재 재생 목록=======");
					System.out.println("재생 목록이 없습니다!");
				} else {
					System.out.println("======현재 재생 목록=======");
					for (int i = 0; i < ml.size(); i++) {
						System.out.println(i + 1 + ". " + ml.get(i));
					}
				}
			} else if (menu == 3) {
				System.out.println("=======================");
				System.out.println("[1] 선택 삭제 [2] 전체 삭제 >> ");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.print("삭제할 번호 입력 : ");
		               int index = sc.nextInt();

		               ml.remove(index - 1);
		               System.out.println("삭제되었습니다~");
				} else if (choice == 2) {
					ml.clear();
					System.out.println("전체 리스트가 삭제되었습니다.");
				}
			} else if (menu == 4) {
				System.out.println("뮤직 플레이리스트를 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해 주세요");
			}
		}
	}
}

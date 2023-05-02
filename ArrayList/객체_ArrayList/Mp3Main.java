package 객체_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Main {

	public static void main(String[] args) {
		
		ArrayList<Mp3> ml = new ArrayList<Mp3>();
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();

		Mp3 music1 = new Mp3("2022", "Anne Marie", ".\\music\\Anne Marie - 2002.mp3");
		Mp3 music2 = new Mp3("깡", "Rain", ".\\music\\Rain - 깡.mp3");
		Mp3 music3 = new Mp3("A Whole New World", "Mena Massoud, Naomi Scott",
				".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");

		ml.add(music1);
		// ml.add(new Mp3 ("사계", "태연"));
		ml.add(music2);
		ml.add(music3);

		// 틀 만들기
		// 1번 - 재생
		// 2번 - 정지
		// 3번 - 이전곡
		// 4번 - 다음곡
		// 5번 - 종료

		int index = 0;
		while (true) {
			System.out.print("[1]재생  [2]정지  [3]이전곡  [4]다음곡  [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 재생
				// 제목 - 가수
				String title = ml.get(index).getSinger();
				String singer = ml.get(index).getTitle();
				String path = ml.get(index).getPath();
				System.out.printf("%s - %s%n", title, singer);
				mp3.play(path);
			} else if (menu == 2) {
				
				// 정지
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
			} else if (menu == 3) {
				// 이전곡
				index--;
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				if (index < 0) {
					index = ml.size() - 1;
				}

				String title = ml.get(index).getSinger();
				String singer = ml.get(index).getTitle();
				String path = ml.get(index).getPath();

				System.out.printf("%s - %s%n", title, singer);

				mp3.play(path);
			} else if (menu == 4) {
				// 다음곡
				index++;
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				if (index >= ml.size()) {
					index = 0;
				}

				String title = ml.get(index).getSinger();
				String singer = ml.get(index).getTitle();
				String path = ml.get(index).getPath();

				System.out.printf("%s - %s%n", title, singer);

				mp3.play(path);
			} else if (menu == 5) {
				mp3.stop();
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해 주세요");
			}
		}
	}
}
package 이차원배열;

public class Ex02_실습2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 3 };
//		학생 3명의 국영수사과 점수를 저장하고 출력하기 
		int[][] scores = { { 50, 10, 80, 10, 45 }, { 70, 40, 30, 80, 100 }, { 10, 100, 80, 30, 90 } };
//		점수 -> 변수
//		여러과목의 점수 -> 1차원배열
//		여러 학생의 과목 점수 -> 2차원배열

//		학생들의 모든 점수 출력
//		0번 학생부터 2번 학생까지
//		0번학생 -> 0번 과목 ~ 4번 과목 
//		1번학생 -> 0번 과목 ~ 4번 과목 
//		2번학생 -> 0번 과목 ~ 4번 과목 

		for (int d = 0; d < scores.length; d++) {
			int sum = 0;
			System.out.print(d + "번 학생 : ");
			for (int i = 0; i < scores[d].length; i++) {
			System.out.print(scores[d][i] + " ");
			sum = sum + scores[d][i];
			
			}
			System.out.println("총합 : " + sum / scores[d].length);
		}
	}
}

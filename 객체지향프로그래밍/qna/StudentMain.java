package qna;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", "20220614", 20, 60, 80, 55);
		Student stu2 = new Student("이주희", "19961025", 27, 55, 36, 85);
		
		stu.Show();
		stu2.Show();
		
	}
}

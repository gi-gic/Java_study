
public class 치환 {
	
	public static void main(String[] args) {
		
		String 오른손 = "마이크";
		String 왼손 = "볼펜";
		
		String 책상 = ""; // temp
		
		System.out.println("오른손 : " + 오른손);
		System.out.println("왼손 : " + 왼손);
		
		책상 = 오른손;
		오른손 = "볼펜";
		왼손 = 책상;
		
		System.out.println("오른손 : " + 오른손);
		System.out.println("왼손 : " + 왼손);
		
		
	}

}

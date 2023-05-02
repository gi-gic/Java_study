package ood;

public class Contact {

	// 필드 --> 접근제한자
	private String name;
	private int age;
	private String tel;
	
	//생성자 메소드
	public Contact(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	// getter / setter  메소드 --> 접근제한자에 접근하기 위해서 사용함 ㅇㅇ
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}

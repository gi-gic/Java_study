package ood;

import java.awt.desktop.AboutEvent;
import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		// 객체생성
		Contact c1 = new Contact("장예슬", 26, "010-4462-6523");
		contacts.add(c1);
		contacts.add(new Contact("강로운", 21, "010-1111-2222"));
		contacts.add(new Contact("임소완", 22, "010-2222-2222"));
		contacts.add(new Contact("김종현", 23, "010-2222-3333"));
		
		                     // c1 =
		for (int i = 0; i < contacts.size(); i++) {
			String name = contacts.get(i).getName();
			int age = contacts.get(i).getAge();
			String tel = contacts.get(i).getTel();
			
			// 장예슬(20) : 010-4462-6523
			System.out.printf(i + 1 + ". %s(%d) : %s%n", name, age, tel);
		}
	}
}

package ex1104;

import java.lang.reflect.Array;

import java.util.Arrays;

public class Ex03_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] sco = score.split(",");

		System.out.println(Arrays.toString(sco));
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < sco.length; i++) {
			if (sco[i].equals("A")) {
				a++;
			} else if (sco[i].equals("B")) {
				b++;
			} else if (sco[i].equals("C")) {
				c++;
			} else if (sco[i].equals("D")) {
				d++;
			} else if (sco[i].equals("F")) {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");	
	}
}
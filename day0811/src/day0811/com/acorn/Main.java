package day0811.com.acorn;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(SSC(sc, 1));
		System.out.println(SSC(sc, 1f));

	}

	public static int SSC(Scanner sc, int x) {
		System.out.println("정수 입력>>");
		return sc.nextInt();
	}

	public static float SSC(Scanner sc, Float x) {
		System.out.println("실수 입력>>"); 
		return sc.nextFloat();
	}
}
   
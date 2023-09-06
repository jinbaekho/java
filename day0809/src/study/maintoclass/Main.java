package study.maintoclass;

import java.util.Scanner;

import study.maintosub.Add;

public class Main {
	// 필드 영역
	// 개체 부분
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");

		int orDer=sc.nextInt();

		System.out.println("첫번째 수 입력");
		int x = sc.nextInt();
		System.out.println("두번째 수 입력");
		int y = sc.nextInt();

		Add ad = new Add();
			 if(orDer==1) {System.out.println("두수의 합은 "+ad.fAdd(x,y));}
		else if(orDer==2) {System.out.println("두수의 차는 "+Add.fSub(x,y));}
		else if(orDer==3) {System.out.println("두수의 곱은 "+Add.fMul(x,y));}
		else if(orDer==4) {System.out.println("두수의 나누기는 "+Add.fDiv(x,y));}

	}

	
}

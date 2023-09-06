package com.acorn;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
		int iMath=sc.nextInt();
		System.out.print("1.정수입력"); int iFN=sc.nextInt();
		System.out.print("2.정수입력"); int iSN=sc.nextInt();
		if(iMath==1) {System.out.println("값="+add(iFN,iSN));}
		if(iMath==2) {System.out.println("값="+sub(iFN,iSN));}
		if(iMath==3) {System.out.println("값="+mul(iFN,iSN));}
		if(iMath==4) {System.out.println("값="+div(iFN,iSN));}
	}
	
	public static int add(int iFN,int iSN) {
		return iFN+iSN;
	}
	public static int sub(int iFN,int iSN) {
		return Math.abs(iFN-iSN);
	}
	public static int mul(int iFN,int iSN) {
		return iFN*iSN;
	}
	public static float div(int iFN,int iSN) {
		if(iSN==0) {return 0;}
		return iFN/iSN;
	}
}

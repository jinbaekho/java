package com.acorn;

public class MethodMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iSum = {10,20,100,200,90,70};
		System.out.println(dnWKf(iSum));
	}

	public static int dnWKf(int[] iSum) {
		int iTot=0;
		for(int i=0;i<iSum.length;i++) {
			iTot+=iSum[i];
		}
		return iTot;
	}
}

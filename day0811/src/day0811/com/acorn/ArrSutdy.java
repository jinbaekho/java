package day0811.com.acorn;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSutdy {
	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);

		while (true)
			{
				int scanNum = InPut(sc, "배열크기를 지정(홀수)");
				if (scanNum % 2 == 1) {
					MakeArr(sc, scanNum);
					break;
				} else {System.out.println("다시입력하세요");}
			}
		sc.close();
		}

	public static int InPut(Scanner sc, String teXt) 
		{
		System.out.println(teXt);
		return sc.nextInt();
		}
	
	public static void MakeArr(Scanner sc,int scanNum) 
		{
		int[] arrNum = new int[scanNum];
		System.out.println(Arrays.toString(arrNum));
		arrNum[arrNum.length / 2] = InPut(sc, "중간에 넣을 값 입력");
		int[] arrNum1 =new int[scanNum];
		int[] arrNum2 =new int[scanNum];
		for(int i=0;i<arrNum.length;i++) {
			if(i%2!=0) {arrNum1[i]=arrNum[arrNum.length / 2];}
			else{arrNum2[i]=arrNum[arrNum.length / 2];}
		}
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(arrNum1));
		System.out.println(Arrays.toString(arrNum2));
		}
}
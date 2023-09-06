package com.acorn;

import java.util.Arrays;
import java.util.Scanner;

public class Game2048 {
	static int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	public static void main(String[] args) {
		NN();
		DP();
	}

	public static void DP() {
		System.out.println(Arrays.toString(arr[0]) + '\n' + Arrays.toString(arr[1]) + '\n' + Arrays.toString(arr[2]));
	}

	public static void NN() {
		int x = (int) Math.round(Math.random() * 2);
		int y = (int) Math.round(Math.random() * 2);
		if (arr[x][y] == 0) {
			arr[x][y] = (int) (Math.round(Math.random()) + 1);
		}
	}

	public static void NextN(){
		Scanner sc=new Scanner(System.in);
		sc.nextInt();
		arr[]
	}
}

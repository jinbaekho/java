package com.acorn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunMain {
	public static void main(String[] args) throws IOException {
//		File objFile =new File("tablelikedata.txt");
//		FileReader objFr=new FileReader(objFile);
//		BufferedReader br=new BufferedReader(objFr);
		
		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\hbi\\eclipse-workspace\\day0905\\src\\com\\acorn\\tablelikedata.txt")));
		
	
		String oneLine = null;
		
		int iLineType=0;
		while ((oneLine = br.readLine()) != null) {
			if (oneLine.startsWith("Title")) {
				iLineType=0;
			} else if (oneLine.startsWith("Data")) {
				iLineType=1;
			}
			if (iLineType==1) {
				String[] sSplitVal= oneLine.split("#");
				System.out.print(sSplitVal[1]+" ");
				System.out.print(sSplitVal[2]+" ");
				System.out.print(sSplitVal[3]+" \n");
			}
		}
		
		
		
		
		
		br.close();
		
	}
}

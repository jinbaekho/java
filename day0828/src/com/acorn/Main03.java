package com.acorn;

public class Main03 {

	public static void main(String[] args) {
		String[][] sGoodsArray = {
				{"2345", "상품", "A업체", "A업체 상품입니다."},
				{"5678", "상품", "C업체", "C업체 상품입니다."}
		};
		
		String[][] sStockArray = {
				{"1234", "160"},
				{"2345", "200"}
		};
	
		JSONDataProcLibFix jsonDataProcLibFix = new JSONDataProcLibFix();
		
		jsonDataProcLibFix.initJsonData(sGoodsArray, sStockArray);
	
		// get 테스트
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1"));
		System.out.println("==============================");
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1", "상품"));
		System.out.println("==============================");
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1", "재고"));
		System.out.println("==============================");
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1", "상품", "상품코드"));
		System.out.println("==============================");
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1", "재고", "재고량"));
		
		// set 테스트
		jsonDataProcLibFix.setTopGoodsInfoMapElement("상품명1", "재고", "재고량", "40");
		System.out.println("==============================");
		System.out.println(jsonDataProcLibFix.getLevelData("상품명1", "재고", "재고량"));
	}

}

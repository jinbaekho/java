package com.acorn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JSONDataProcLibFix {
	private ArrayList<GoodsFix> goodsList02;
	private ArrayList<StockFix> stockList02;
	
	private ArrayList<HashMap<String, String>> goodsMapList01;
	private ArrayList<HashMap<String, String>> stockMapList01;
	
	private ArrayList<HashMap<String, HashMap<String, String>>> upperGoodsInfoMapList01;
	
	private HashMap<String, HashMap<String, HashMap<String, String>>> topGoodsInfoMap;
	
	public JSONDataProcLibFix() {		
		goodsList02 = new ArrayList<GoodsFix>();
		stockList02 = new ArrayList<StockFix>();
		
		
		goodsMapList01 = new ArrayList<HashMap<String,String>>();
		stockMapList01 = new ArrayList<HashMap<String,String>>();
		
		upperGoodsInfoMapList01 = new ArrayList<HashMap<String,HashMap<String,String>>>();
		
		topGoodsInfoMap = new HashMap<String, HashMap<String,HashMap<String,String>>>();
	}

	public void initJsonData(String[][] sGoodsArray, String[][] sStockArray) {
		String[] sGoodsInitValue = new String[sGoodsArray[0].length]; 
		String[] sStockInitValue = new String[sGoodsArray[0].length];
		for(int i = 0; i < sGoodsArray.length; i++) {
			for(int j = 0; j < sGoodsArray[i].length; j++) {
				sGoodsInitValue[j] = sGoodsArray[i][j];
			}
			goodsList02.add(new GoodsFix(sGoodsInitValue));
		}
		
		for(int i = 0; i < sStockArray.length; i++) {
			for(int j = 0; j < sStockArray[i].length; j++) {
				sStockInitValue[j] = sStockArray[i][j];
			}
			stockList02.add(new StockFix(sStockInitValue));
		}
		
		
		if(goodsList02.size() != stockList02.size()) {
			System.out.println("두 리스트의 사이즈가 다릅니다.");
			return;
		} else {
			for(int i = 0; i < goodsList02.size(); i++) {
				HashMap<String, String> tempHash = new HashMap<String, String>();
				tempHash.put("상품코드", goodsList02.get(i).getiGoodsCode());
				tempHash.put("제조업체", goodsList02.get(i).getsMaker());
				tempHash.put("상품설명", goodsList02.get(i).getDescription());
				goodsMapList01.add(tempHash);
			}
			for(int i = 0; i < stockList02.size(); i++) {
				HashMap<String, String> tempHash = new HashMap<String, String>();
				tempHash.put("상품코드", stockList02.get(i).getiGoodsCode());
				tempHash.put("재고량", stockList02.get(i).getiStockQty());
				stockMapList01.add(tempHash);
			}
		}
		
		for(int i = 0; i < goodsMapList01.size(); i++) {
			HashMap<String, HashMap<String, String>> tempHash = 
					new HashMap<String, HashMap<String, String>>();
			tempHash.put("상품", goodsMapList01.get(i));
			tempHash.put("재고", stockMapList01.get(i));
			upperGoodsInfoMapList01.add(tempHash);
			
		}
		
		for(int i = 0; i < upperGoodsInfoMapList01.size(); i++) {
			topGoodsInfoMap.put("상품명1", upperGoodsInfoMapList01.get(i));
		}
	}
	
	public Map<String, HashMap<String, HashMap<String, String>>> getTopGoodsInfoMap() {
		return topGoodsInfoMap;
	}
	
	public void setTopGoodsInfoMapElement(String sFirstElement, String sSecondElementIdx, 
			String sKey, String sValue) {
		(topGoodsInfoMap.get(sFirstElement).get(sSecondElementIdx)).put(sKey, sValue);
	}
	
	public HashMap<String, HashMap<String,String>> getLevelData(String key)
	{
		HashMap<String, HashMap<String,String>> retHashValue = null;
		
		retHashValue = getTopGoodsInfoMap().get(key);
		if(retHashValue == null) {
			System.out.println("존재하지 않는 키 값입니다.");
		} 
		
		return retHashValue;
	}
	
	public HashMap<String, String> getLevelData(String key1, String key2)
	{
		HashMap<String, String> retHashValue = null;
		
		retHashValue = getTopGoodsInfoMap().get(key1).get(key2);
		if(retHashValue == null) {
			System.out.println("존재하지 않는 키 값입니다.");
		} 
		
		return retHashValue;
	}
	
	public String getLevelData(String key1, String key2, String key3)
	{
		String sRet = null;
		
		sRet = getTopGoodsInfoMap().get(key1).get(key2).get(key3);
		if(sRet == null) {
			sRet = "존재하지 않는 키 값입니다.";
		}
		
		return sRet;
	}
}

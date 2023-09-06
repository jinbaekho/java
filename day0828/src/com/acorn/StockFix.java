package com.acorn;

public class StockFix {
	private String sGoodsCode;
	private String sStockQty;

	public StockFix() { }	
	public StockFix(String sGoodsCode, String sStockQty) {
		this.sGoodsCode = sGoodsCode;
		this.sStockQty = sStockQty;
	}

	public StockFix(String[] stockInfo) {
		this.sGoodsCode = stockInfo[0]; 
		this.sStockQty = stockInfo[1];
	}
	
	public String getiGoodsCode() {
		return sGoodsCode;
	}

	public void setiGoodsCode(String iGoodsCode) {
		this.sGoodsCode = iGoodsCode;
	}

	public String getiStockQty() {
		return sStockQty;
	}

	public void setiStockQty(String sStockQty) {
		this.sStockQty = sStockQty;
	}

}

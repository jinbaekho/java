package com.acorn;

public class GoodsFix {
	private String iGoodsCode;
	private String sGoodsName;
	private String sMaker;
	private String sDescription;

	public GoodsFix() { }
	
	public GoodsFix(String iGoodsCode, String sGoodsName,
			String sMaker, String description) {
		this.iGoodsCode = iGoodsCode;
		this.sGoodsName = sGoodsName;
		this.sMaker = sMaker;
		this.sDescription = description;
	}
	
	public GoodsFix(String[] goodsInfo) {
		this.iGoodsCode = goodsInfo[0]; 
		this.sGoodsName = goodsInfo[1];
		this.sMaker = goodsInfo[2];
		this.sDescription = goodsInfo[3];
	}

	public String getiGoodsCode() {
		return iGoodsCode;
	}

	public void setiGoodsCode(String iGoodsCode) {
		this.iGoodsCode = iGoodsCode;
	}
	
	public String getiGoodsName() {
		return sGoodsName;
	}

	public void setiGoodsName(String sGoodsName) {
		this.sGoodsName = sGoodsName;
	}

	public String getsMaker() {
		return sMaker;
	}

	public void setsMaker(String sMaker) {
		this.sMaker = sMaker;
	}

	public String getDescription() {
		return sDescription;
	}

	public void setDescription(String description) {
		this.sDescription = description;
	}
}

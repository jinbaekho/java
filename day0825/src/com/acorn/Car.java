package com.acorn;

public class Car {
	//  필드 영역
	private String 	sManufacturer; 		// null
	private float 	fFuel;				// 0.0
	private float 	fSpeed;				// 0.0
	private int 	IRegistrationNum;	// 0
	private boolean bRunning;			// false 주행여부
	
	// 생성자 영역
	public Car() {}
	public Car(String sManufacturer, 
			float fFuel) {
		this.sManufacturer = sManufacturer;
		this.fFuel = fFuel;
	}
	
	public String getsManufacturer() {
		return sManufacturer;
	}
	public void setsManufacturer(String sManufacturer) {
		this.sManufacturer = sManufacturer;
	}
	public float getfFuel() {
		return fFuel;
	}
	public void setfFuel(float fFuel) {
		this.fFuel = fFuel;
	}
	public float getfSpeed() {
		return fSpeed;
	}
	public void setfSpeed(float fSpeed) {
		this.fSpeed = fSpeed;
	}
	public int getIRegistrationNum() {
		return IRegistrationNum;
	}
	public void setIRegistrationNum(int iRegistrationNum) {
		IRegistrationNum = iRegistrationNum;
	}
	public boolean isbRunning() {
		return bRunning;
	}
	public void setbRunning(boolean bRunning) {
		this.bRunning = bRunning;
	}
	// 메소드 영역
	public void switchOn() {
		bRunning =  true;
	}
	
	public void switchOff() {
		bRunning = false;
	}
	
	public void accerlate() {
		// 속도 변화
		if(!bRunning) return; 
		
		fSpeed += 20;
		if(fFuel > 0.f) {
			fFuel -= 1.0;
			if(fFuel < 0) {
				fFuel = 0.f;
				_break();
			}
		}	
	}
	
	public  void _break() {
		// 속도 변화
		fSpeed = 0.f;
	}
	
	public void fillFuel(float fFloat) {
		_break();
		switchOff();
		fFuel+=fFloat;
	}
	
	public void displayCarInfo() {
		System.out.println(sManufacturer);
	}
	
	
}

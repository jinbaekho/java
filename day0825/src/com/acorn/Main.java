package com.acorn;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("hyndai",20.5f);
		
		System.out.println(car.getsManufacturer());
		System.out.println(car.getfFuel());
		
		// 차량 구동
		car.switchOn();
		// 가속페달 밟기
		car.accerlate();
		// 차량 속도 알아내기
		System.out.println("속도"+car.getfSpeed());
		// 차량 연료량 알아내기
		System.out.println("연료"+car.getfFuel());
		// 가속페달 밟기
		car.accerlate();
		// 차량 속도 알아내기
		System.out.println("속도"+car.getfSpeed());
		// 차량 연료량 알아내기
		System.out.println("연료"+car.getfFuel());
		// 차량 중지
		car._break();
		System.out.println("속도"+car.getfSpeed());
		System.out.println("연료"+car.getfFuel());
		car.fillFuel(20);
		car.displayCarInfo();
		System.out.println("속도"+car.getfSpeed());
		System.out.println("연료"+car.getfFuel());
		
	}
	
	
}


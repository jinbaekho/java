package com.acorn;

public class FactoryProducer {
	//  필드 영역: 없어도 된다.
	
	// 생성자: 기본생성자는 작성하지 않아도 된다.
	
	// 메소드: Getters/Setters 영역/정적 영역/동적 영역
	// 리턴값 함수명(인자들)
	public AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
	
}

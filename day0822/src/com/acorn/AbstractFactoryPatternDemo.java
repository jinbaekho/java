package com.acorn;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer factoryProducer =  new FactoryProducer();
		AbstractFactory abstractFactory = 
				factoryProducer.getFactory(true);
		
		Shape shape = abstractFactory.getShape("roundedsquare");
		shape.draw();

	}

}

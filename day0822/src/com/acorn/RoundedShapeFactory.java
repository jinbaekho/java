package com.acorn;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("roundedrectangle")) {
			return new RoundedRectangle();
		} else if(type.equalsIgnoreCase("roundedsquare")) {
			return new RoundedSquare();
		}
			
		return null;
	}

}

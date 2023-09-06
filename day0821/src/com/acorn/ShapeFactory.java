package com.acorn;

/**
 * 
 */
public class ShapeFactory {

    /**
     * Default constructor
     */
    public ShapeFactory() {
    }

    /**
     * @param type 
     * @return
     */
    public Shape getShape(String type) {
    	Shape shape = null;
    	if(type.equals("circle")) {
    		shape = new Circle();		
    	} else if(type.equals("square")) {
    		shape = new Square();
    	} else if(type.equals("rectange")) {
    		shape = new Rectangle();
    	} 
    	
    	return shape;
    }

}
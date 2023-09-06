package com.acorn.snack;

public class SnackController {
	private Snack s;
	
	public SnackController() {}
	
	public Snack saveData(String kind,
			String name, String flavor,
			int numOf, int price) {
		s = new Snack(kind, name, flavor, numOf, price);
		
		
		return s;
	}

	
}

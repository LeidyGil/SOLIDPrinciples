package com.automation.lspwrong;

public class AreaCalculator {
	
	public static int calculateArea(Rectangle r) {
		return r.getHeight() * r.getWidth();
	}
	
	public static int calculateArea(Square s) {
		return s.getHeight() * s.getHeight();
	}
	
}

package com.velocity.console_calculator;

import com.velocity.calculator.Calculation;

//main class used to call the implementation class.
public class Calculator {
	
	public static void main(String[] args) {
		
		Calculation select = new Calculation();
		select.selectOperation();	
		
	}
	
}

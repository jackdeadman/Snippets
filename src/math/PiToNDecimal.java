package math;

import java.math.BigDecimal;
import java.util.Scanner;

public class PiToNDecimal {

	static Scanner userInput = new Scanner(System.in);
	
	private static int getDecimalLimit(){
		
		int limit = userInput.nextInt();
		return limit;
		
	}
	
	private static BigDecimal findPi(){
		
		BigDecimal piApprox = new BigDecimal(4*( Math.atan(1.0f / 2.0f) + Math.atan(1.0f / 3.0f) ));
		return piApprox;
	}	
	
	public static void main(String[] args){
		
		System.out.println("Input the number of decimal places you want to calculate Pi to: ");
		String piString = findPi().toString().substring(0, getDecimalLimit() + 2);
		System.out.println(piString);
		
	}
	
}

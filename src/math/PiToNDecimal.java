package math;

import java.math.BigDecimal;
import java.util.Scanner;

public class PiToNDecimal {

	static Scanner userInput = new Scanner(System.in);
	
	private static int getDecimalLimit(){
		
		int limit = userInput.nextInt();
		
		return limit;
		
	}
	
	/*private static double findPi(){
		double a = 1;
		double b = 1/Math.sqrt(2);
		double t = 0.25;
		double p = 1;
		double pi = 0;
		
		int iterator = 0;
		while(iterator < 1){
			double temp = a;
			
			a = (1 + (1/Math.sqrt(2))) / 2;
			b = Math.sqrt(1*(1/Math.sqrt(2)));
			t = 0.25 - 1*Math.pow((1 - (1 + (1/Math.sqrt(2))) / 2), 2);
			p = 2 * p;
			
			pi = (Math.pow((a + b), 2)) / 4 * t;
			System.out.println(pi);
			
			iterator++;
		}
		
		
		return pi;
	}*/
	
	private static BigDecimal findPi(){
		
		BigDecimal pi = new BigDecimal(4*((Math.atan(0.5f) + Math.atan(1.0f / 3.0f))));
		
		return pi;
	}	
	
	public static void main(String[] args){
		
		String piString = findPi().toString().substring(0, getDecimalLimit() + 2);
		System.out.println(piString);
		
	}
	
}

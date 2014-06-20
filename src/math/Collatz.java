package math;

import java.util.Scanner;

public class Collatz {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[]args){
		
		System.out.println("Enter a number between -2^63 and 2^63.");
		
		long num = userInput.nextLong();
		int numSteps = 0;
		
		while(num > 1){
			
			if(num % 2 == 0){
				num = num/2;
			}else{
				num = (num*3) + 1;
			}
			
			System.out.print(num + " -> ");
			
			numSteps++;
		}
		
		System.out.println("It took " + numSteps + " steps to reach one.");
	}
	
}

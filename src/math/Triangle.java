package math;

import java.util.Scanner;

public class Triangle {
	
	static Scanner userInput = new Scanner(System.in);
	/*
	 * Given a number N and then N lines of information in the form of two side lengths (eg a=3 b=4),
	 * and an angle (right angle in degrees), calculate the third side (the hypotenuse) and the other two angles (in degrees).
	 * Print out the side and these angles with the rest of the triangle info, in the form of a list with newlines
	 * between information eg:
	 * a=3
	 * b=4
	 * etc
	 * Needs to be written so the code is extensible - use methods, use classes if needed, don't compromise on
	 * coding style for the sake of getting this specific case to work. 
	 * Conversion to radians may be necessary, use of basic trig and pythag will of course be needed. 
	 */
	private static double calculateHypotenuse(double a, double b){
		
		return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
	}
	
	public static void main(String[] args){
		//test with pythagorean triple
		//System.out.print(calculateHypotenuse(3,4));
		System.out.println();
		
	}
	
}

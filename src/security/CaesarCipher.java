package security;

import java.util.Scanner;

public class CaesarCipher {

	static Scanner keyboardInput = new Scanner(System.in);
	
	private static char[] getPlainText(){
		
		System.out.println("Enter your plaintext: ");
		//takes keyboard input and strips it of whitespace
		String tempPlainText = keyboardInput.nextLine().replaceAll("\\s+", "");
		char[] parsedPlainText = tempPlainText.toUpperCase().toCharArray();
		
		return parsedPlainText;
		
	}
	
	private static int getShift(){
		
		System.out.println("Enter your shift: ");
		int shift = keyboardInput.nextInt();
		
		return shift;
	}
	
	private static void encrypt(char[] parsedPlainText, int b){
		//character limit of 500 is arbitrary workaround to avoid having to use an ArrayList
		int[] shiftedArray = new int[500];
		
		for(int i = 0; i < parsedPlainText.length; i++){
			shiftedArray[i] = parsedPlainText[i] + b;
			System.out.print((char)(shiftedArray[i]));
		}
		
	}
	
	public static void main(String[] args){
		
		encrypt(getPlainText(), getShift());
		
	}
	
}
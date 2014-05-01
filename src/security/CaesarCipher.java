package security;

import java.util.ArrayList;
import java.util.Scanner;

//take an input string, 
//assign that to a variable, 
//parse the text into individual characters
//shift each character by a fixed shift amount specified by the user
//return ciphertext

public class CaesarCipher {
	
	static Scanner userInput = new Scanner(System.in);
	static int shift;
	
	
	public static void main(String[] args){
		
		System.out.print(applyCipher(getInput()));
		
	}
	
	private static ArrayList<Character> getInput(){

		String plaintext = userInput.nextLine();
		shift = userInput.nextInt();
		ArrayList<Character> parsedText = new ArrayList<Character>();
		
		for(int i=0; i< plaintext.length(); i++){
			
			if(plaintext.charAt(i) != ' '){
				parsedText.add(plaintext.charAt(i));
			}else{
				continue;
			}
			
			
		}
		
		return parsedText;
		
	}	
	
	private static ArrayList<Character> applyCipher(ArrayList<Character> parsedText){

		ArrayList<Character> cipher = new ArrayList<Character>();
		
		for(int i=0; i<parsedText.size(); i++){
			
			cipher.add((char)((int)(parsedText.get(i))+shift));
			
		}
		
		return cipher;
	}	
	
}

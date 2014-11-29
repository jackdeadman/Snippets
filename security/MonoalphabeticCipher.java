package security;

import java.util.HashMap;
import java.util.Scanner;

public class MonoalphabeticCipher {
		
	/*take key input - map each letter to another letter - asking for each letter individually eg a = *input* b = *input*
	 * 
	 *take keyboard input, strip spaces and punctuation
	 *make text lowercase
	 *
	 *switch every letter of the plaintext with it's corresponding letter in the key
	 */
	
	private static String getPlaintextInput(){
		
		Scanner textInput = new Scanner(System.in);
		
		String plaintext = textInput.nextLine().toLowerCase().replaceAll("//s+", "");
		
		return plaintext;
	}
	
	private static HashMap getKeyInput(){
		
		HashMap<Character, Character> key = new HashMap<Character, Character>();
		
		Scanner keyInput = new Scanner(System.in);
		
		System.out.println("a = ");
		key.put('a', keyInput.nextLine().charAt(0));
		System.out.println("b = ");
		key.put('b', keyInput.nextLine().charAt(0));
		System.out.println("c = ");
		key.put('c', keyInput.nextLine().charAt(0));
		System.out.println("d = ");
		key.put('d', keyInput.nextLine().charAt(0));
		System.out.println("e = ");
		key.put('e', keyInput.nextLine().charAt(0));
		System.out.println("f = ");
		key.put('f', keyInput.nextLine().charAt(0));
		System.out.println("g = ");
		key.put('g', keyInput.nextLine().charAt(0));
		System.out.println("h = ");
		key.put('h', keyInput.nextLine().charAt(0));
		System.out.println("l = ");
		key.put('l', keyInput.nextLine().charAt(0));
		System.out.println("w = ");
		key.put('w', keyInput.nextLine().charAt(0));
		System.out.println("o = ");
		key.put('o', keyInput.nextLine().charAt(0));
		System.out.println("r = ");
		key.put('r', keyInput.nextLine().charAt(0));
		
		return key;
	}
	
	public static void main(String[] args){
		
		char[] cipherText = getPlaintextInput().toCharArray();
		
		for(int i=0; i<getPlaintextInput().length(); i++){
			
			
			//if(getPlaintextInput.charAt(i) == getKeyInput().get('h')) cipherText.charAt(i) = getKeyInput().get
			if(getPlaintextInput().charAt(i) == 'a')cipherText[i] = (char) getKeyInput().get('a');
			//this could be continued for each letter - but seems very clunky - I mean it'd work, but surely there are shorter ways of implementing this cipher?
		}
		
	}
	
	
}

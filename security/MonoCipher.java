import java.util.*;

public class MonoCipher{

	/*block of static arrays used in the process - these could be adapted further with getter and
	setter methods to allow for another class to use them. As it is the arrays are populated inline,
	calling getInput() outside of another method.
	*/
	private static Scanner userInput = new Scanner(System.in);
	private static char[] cipherbet = makeCharArray(getInput("Enter the cipherbet with no spaces."));
	private static char[] plaintext = makeCharArray(getInput("Enter the plaintext."));
	private static char[] alphabet = makeCharArray("abcdefghijklkmnopqrstuvwxyz");
	private static char[] ciphertext = new char[plaintext.length];
	private static HashMap<Character, Character> characterMap = new HashMap<Character, Character>();
	
	public static void main(String[] args){

		populateCharacterMap();
		encrypt();
		//printCipher takes a prompt so it can display something before the cipher is printed, this could be blank.
		printCipher("The ciphertext is: ");

	}

	public static void printCipher(String prompt){

		System.out.print(prompt);

		for(char letter : ciphertext){

			System.out.print(letter);

		}

		System.out.println();

	}

	public static void encrypt(){

		for(int j = 0; j < plaintext.length; j++){

			//works out the position in the alphabet that the letter to be ciphered is at. 
			int charPosition = (int)plaintext[j] - 65;

			//checks if the character to be ciphered is a letter, if not, leaves it alone.
			if(characterMap.containsKey(plaintext[j])){

				ciphertext[j] = characterMap.get(alphabet[charPosition]);

			}else{

				ciphertext[j] = plaintext[j];

			}

		}

	}

	public static void populateCharacterMap(){

		//maps each letter in the alphabet to a letter in the cipherbet
		for(int i = 0; i < 26; i++){

			characterMap.put(alphabet[i], cipherbet[i]);

		}

	}

	public static char[] makeCharArray(String inputString){

		char[] outputArray = inputString.toUpperCase().toCharArray();
		return outputArray;

	}

	public static String getInput(String prompt){

		System.out.println(prompt);
		String input = userInput.nextLine();
		return input;

	}

}
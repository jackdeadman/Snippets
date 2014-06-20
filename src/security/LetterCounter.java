package security;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCounter {
	
	static Scanner stringInput = new Scanner(System.in);
	static ArrayList<String> parsedString = new ArrayList<String>();
	
	static int[] numLetter = new int[26];
	
	
	public static void main(String[]args){
		
		for(int k=0; k<=25; k++){
			numLetter[k] = 0;
		}
		
		String string = stringInput.nextLine();
		
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i) != ' '){
				parsedString.add(string.substring(i, i+1));
			}else{
				continue;
			}
			
		}
		
		for(int it = 0; it < parsedString.size(); it++){
		
		    for(char ch = 'a'; ch <= 'z'; ch++){
		    	
		    	//String temp = ch;
		    	int index = (int)ch;
		    	
		    	
		    	if(parsedString.get(it) == Character.toString(ch)){
		    		numLetter[ch]++; 
		    	}
		    }
		}
		
		
		
		
		/*for(int j=0; j<parsedString.size(); j++){
			if(parsedString.get(j).equalsIgnoreCase("a")){
				numLetter[0]++;
			}else if(parsedString.get(j).equalsIgnoreCase("b")){
				numLetter[1]++;
			}else if(parsedString.get(j).equalsIgnoreCase("c")){
				numLetter[2]++;
			}else if(parsedString.get(j).equalsIgnoreCase("d")){
				numLetter[3]++;
			}else if(parsedString.get(j).equalsIgnoreCase("e")){
				numLetter[4]++;
			}else if(parsedString.get(j).equalsIgnoreCase("f")){
				numLetter[5]++;
			}else if(parsedString.get(j).equalsIgnoreCase("g")){
				numLetter[6]++;
			}else if(parsedString.get(j).equalsIgnoreCase("h")){
				numLetter[7]++;
			}else if(parsedString.get(j).equalsIgnoreCase("i")){
				numLetter[8]++;
			}else if(parsedString.get(j).equalsIgnoreCase("j")){
				numLetter[9]++;
			}else if(parsedString.get(j).equalsIgnoreCase("k")){
				numLetter[10]++;
			}else if(parsedString.get(j).equalsIgnoreCase("l")){
				numLetter[11]++;
			}else if(parsedString.get(j).equalsIgnoreCase("m")){
				numLetter[12]++;
			}else if(parsedString.get(j).equalsIgnoreCase("n")){
				numLetter[13]++;
			}else if(parsedString.get(j).equalsIgnoreCase("o")){
				numLetter[14]++;
			}else if(parsedString.get(j).equalsIgnoreCase("p")){
				numLetter[15]++;
			}else if(parsedString.get(j).equalsIgnoreCase("q")){
				numLetter[16]++;
			}else if(parsedString.get(j).equalsIgnoreCase("r")){
				numLetter[17]++;
			}else if(parsedString.get(j).equalsIgnoreCase("s")){
				numLetter[18]++;
			}else if(parsedString.get(j).equalsIgnoreCase("t")){
				numLetter[19]++;
			}else if(parsedString.get(j).equalsIgnoreCase("u")){
				numLetter[20]++;
			}else if(parsedString.get(j).equalsIgnoreCase("v")){
				numLetter[21]++;
			}else if(parsedString.get(j).equalsIgnoreCase("w")){
				numLetter[22]++;
			}else if(parsedString.get(j).equalsIgnoreCase("x")){
				numLetter[23]++;
			}else if(parsedString.get(j).equalsIgnoreCase("y")){
				numLetter[24]++;
			}else if(parsedString.get(j).equalsIgnoreCase("z")){
				numLetter[25]++;
			}else{
				continue;
			}
			
		}*/
		
		
		
		for(char c='a'; c <= 'z'; c++){
			System.out.print(c + " ");
		}
		System.out.println();
		
		for(char iter = 'a'; iter <= 'z'; iter++){
			System.out.print(numLetter[(int)iter] +" ");
		}
		
		
	}
}

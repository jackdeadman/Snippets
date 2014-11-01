import java.util.*;
import java.io.*;

public class FilePrinter{
	
	public static void main(String[] args){

		printFile("test.txt");

	}

	public static void printFile(String filePath){

		try{

			Scanner fileInput = new Scanner(new FileReader(filePath));
			while(fileInput.hasNext()){
				System.out.print(fileInput.next());
			}

		}catch(FileNotFoundException e){

		}

	}

}
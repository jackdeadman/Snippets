import java.util.*;

public class BinaryConverter{
    
    static Scanner binaryInput = new Scanner(System.in);
    
    public static void main(String[] args){
    
        //System.out.println("Binary string is: " + binaryInput("Enter a binary string to convert: "));
        binaryConversion(binaryInput("Enter a binary string to convert: "));
    }
    
    public static String binaryInput(String prompt){
        
        System.out.println(prompt);
        String binaryString = binaryInput.nextLine();
        //int binary = Integer.parseInt(binaryString);
        
        return binaryString;
        
    }
    
    public static void binaryConversion(String binary){
        
        int bit = 0;
        for(int i = 0; i < binary.length()-1; i++){
            
            if(i == 0){
                bit = 2 * Integer.parseInt(binary.substring(i, i+1)) + Integer.parseInt(binary.substring(i+1, i+2));
            }else{
                bit = 2 * bit + Integer.parseInt(binary.substring(i+1, i+2));
            }
            
            System.out.println(bit);
            
        }
        
        
    }
    
    
    
    
    
}
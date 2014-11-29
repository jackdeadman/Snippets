public class Fibonnaci{
    
    static int[] numArray = new int[11];
    static int[] emptyArray = new int[1];
    
    public static void main(String[] args){
        
        for(int i=0; i<10; i++){
            
            System.out.println(generate(2)[i]);
        }
        
    }
    
    public static int[] generate(int n){
        
        emptyArray[0] = 0;
        
        numArray[0] = 1;
        numArray[1] = 1;
        
        numArray[n] = numArray[n-1] + numArray[n-2];
        n++;
        
        if(n < 10){ 
            generate(n); 
            
            return numArray;
        }else{
            
            return emptyArray;
        }
        
        
    }
    
}
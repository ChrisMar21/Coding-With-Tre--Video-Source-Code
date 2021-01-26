
public class FindLCM{
    public static void main(String[] args) {
        System.out.println("Least Common Multiple of 16 and 17: " + LCM(16,17));
    }
    
    public static int LCM(int number1,int number2){
        if(number1 == 0){
            return 0;
        }
        if(number2 == 0){
            return 0;
        }else{
            for(int i = 1;i <= number1 * number2;i++){
                if(i % number1 == 0 && i % number2 == 0){
                    return i;
                
                }
            
            }
        
        }
        
        
        return 1;
    }
    
}
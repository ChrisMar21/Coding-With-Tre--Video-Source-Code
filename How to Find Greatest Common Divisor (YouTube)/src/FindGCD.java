import java.util.ArrayList;
public class FindGCD {
    public static void main(String[] args) {
          System.out.println("The Greatest Common Divisor of 14 and 8: " + GCD(14,8));
        
    }
    public static int GCD(int number1,int number2){
        ArrayList<Integer> factors = new ArrayList();
        
        if(number1 == number2){
            return number1;
        
        }
        if(number1 == 0){
            return number2;
        
        }
        if(number2 == 0){
            return number1;
        
        }
        else{
            int i = 1;
            while(i < Math.max(number1, number2)){
                if(number1 % i == 0 && number2 % i == 0){
                    factors.add(i);
                
                }
                i++;
            
            
            }
            return factors.get(factors.size() - 1);
        
        }
    
    }

    
}
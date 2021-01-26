import java.util.ArrayList;
public class PrimeFirst100{
    public static void main(String[] args) {
        printFirst100Prime();
       
        
   }
public static void printFirst100Prime(){
    ArrayList<Integer> primeNumbers = new ArrayList();
    int i = 1;
    while(primeNumbers.size() < 100){
        if(isPrime(i)){
            primeNumbers.add(i);
            System.out.print(i + " ");
        
        }
        i++;
    
    }
    
}   
public static boolean isPrime(int number){
    if(number == 0 || number == 1){
        return false;
    }
    else{
        int numOfFactors = 0;
        for(int i = 1;i <= number;i++){
            if(number % i == 0){
                numOfFactors++;
            }
        }
        if(numOfFactors > 2){
            return false;
        }
    }

    return true;
 }

}
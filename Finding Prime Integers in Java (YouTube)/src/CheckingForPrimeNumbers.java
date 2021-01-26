import java.util.Scanner;
public class CheckingForPrimeNumbers{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is prime: ");
       int num = input.nextInt();
       isPrime(num);
    }
public static void isPrime(int number){
        int numOfFactors = 0;
        if(number == 0 || number == 1){
            System.out.println(number + " is not prime.");
        }else{
            for(int i = 1;i <= number;i++){
                if(number % i == 0){
                    numOfFactors++;
                }
            
            }
            if(numOfFactors <= 2){
                System.out.println(number + " is prime.");
            
            }
            else{
                System.out.println(number + " is not prime.");
            }
        }
  
    
    
    
    
    
 }
}
public class FindPrimeNumbers{
    public static void main(String[] args) {
        isPrime(21);
 }
    public static void isPrime(int number){
        int numOfFactors = 0;
        
        if(number == 0 || number == 1){
            System.out.println("Not prime bro.");
        }
        
        for(int i = 1;i <= number;i++){
            if(number % i == 0){
                numOfFactors++;
            }
        }
        if(numOfFactors > 2){
            System.out.println(number + " is not prime bro.");
        }
        else if(numOfFactors <= 2){
            System.out.println(number + " is prime, bro.");
        }
    }

}
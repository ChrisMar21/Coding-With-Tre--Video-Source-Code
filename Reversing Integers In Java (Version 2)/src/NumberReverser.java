import java.util.Scanner;
public class NumberReverser{
    int number;
    NumberReverser(int number){
        this.number = number;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number you would like reversed: ");
        int num = input.nextInt();
        NumberReverser nr = new NumberReverser(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + nr.reverseNumber());
        
    }
    public int reverseNumber(){
           int remainder = 0;
           int reversedNumber = 0;
           //123
           while(this.number != 0){
               remainder = this.number % 10;
               reversedNumber = (reversedNumber * 10) + remainder;
               this.number = this.number / 10;
           
           }
           return reversedNumber;
            
        }
        
    }

import java.util.Random;

public class RandomClassProgram{
    public static void main(String[] args) {
       Random rand = new Random();
       int number;
       for(int i = 1;i < 4;i++){
           number = rand.nextInt(3) + 1;
           System.out.println("Number: " + number);
           
       }
        
         
    }
}
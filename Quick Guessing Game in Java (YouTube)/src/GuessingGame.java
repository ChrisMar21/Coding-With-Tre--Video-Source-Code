import java.util.Random;
import java.util.Scanner;
public class GuessingGame{
    Random rand;
    Scanner input;
    int fingers;
    int userNumber;
    
    public GuessingGame(){
        rand = new Random();
        input = new Scanner(System.in);
        fingers = 10;
    }
    
    public void run(){
        System.out.println("Guess how many fingers I am holding up "
                + "behind my back.");
        System.out.print("Your Guess: ");
        userNumber = input.nextInt();
        while(userNumber > 10 || userNumber < 1){
            System.out.println("Guess how many fingers I am holding up "
                + "behind my back.");
            System.out.print("Your Guess: ");
            userNumber = input.nextInt();
        }
        int randomNumber = rand.nextInt(fingers) + 1;
        if(randomNumber == userNumber){
            System.out.println("Ha, you guessed it.");
        
        }
        else{
            System.out.println("Wrong Answer. Your Guess: " + userNumber);
            System.out.println("Correct Number: " + randomNumber);
        }   
    }
    
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.run();
    }
   
}
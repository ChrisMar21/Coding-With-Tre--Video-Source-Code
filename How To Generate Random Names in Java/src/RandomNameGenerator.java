import java.util.Random;
public class RandomNameGenerator{
    int numNames;
    String[]firstNames = {"Nick","Jack","Kobe","Dame","Lebron"};
    String[]lastNames = {"Johnson","Miller","Bryant","Martin","Turner"};
    public RandomNameGenerator(){
       numNames = 5;
        
    }
    public void generateName(){
        Random rand = new Random();
        String firstName = firstNames[rand.nextInt(numNames)];
        String lastName = lastNames[rand.nextInt(numNames)];
        System.out.println(firstName + " " + lastName);
    }
    
    public static void main(String[] args) {
       RandomNameGenerator rng = new RandomNameGenerator();
        System.out.println("List of random names:");
        int counter = 1;
        while(counter <= 3){
            rng.generateName();
            counter++;
        
        }
        
    }
}
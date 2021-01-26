import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class RandomNameGenerator{
    ArrayList<String> firstNames;
    ArrayList<String> lastNames;
    Scanner firstReader;
    Scanner lastReader;
    int numOfNames;
    Random nameGenerator;
    
    //Constructor
    RandomNameGenerator() throws FileNotFoundException{
        firstNames = new ArrayList<>();
        lastNames = new ArrayList<>();
        firstReader = new Scanner(new File("src//FirstNames.text"));
        lastReader = new Scanner(new File("src//LastNames.txt"));
        nameGenerator = new Random();
        numOfNames = 10;
    }
    
    //Method to add first names from text file to firstNames ArrayList
    public void setFirstNames(){
        while(firstReader.hasNext()){
            String firstName = firstReader.nextLine();
            firstNames.add(firstName);
            
        }
    }
    
    //Method to add last names from text file to lastNames ArrayList
    public void setLastNames(){
        while(lastReader.hasNext()){
            String lastName = lastReader.nextLine();
            lastNames.add(lastName);
        }
    }
    
    //Method to generate random names attained from the text files
    public void generateRandomNames(){
        System.out.println("List of Random Names");
        System.out.println("---------------------");
        this.setFirstNames();
        this.setLastNames();
        int index = 1;
        
        //This will print 1) Name, etc...
        for(int i = 0;i < numOfNames;i++){
            System.out.println(index + ") " + firstNames.get(nameGenerator.nextInt(numOfNames))
            + " " + lastNames.get(nameGenerator.nextInt(numOfNames)));
            index++;
        }   
    }
    
    public static void main(String[] args) throws FileNotFoundException {
      RandomNameGenerator rng = new RandomNameGenerator();
      rng.generateRandomNames();
    }
}
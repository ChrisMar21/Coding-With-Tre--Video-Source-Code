import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile{
    public static void main(String[] args) throws FileNotFoundException {
      Scanner fileReader = new Scanner(new File("src//SuperVillains.txt"));
      
      while(fileReader.hasNext()){
          String villain = fileReader.nextLine();
          System.out.print(villain + ", ");
      
      }
      
        
    }

}
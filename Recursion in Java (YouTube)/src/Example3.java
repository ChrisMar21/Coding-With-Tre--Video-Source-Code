
public class Example3{
    public static void main(String[] args) {
        find10Even(2);
        
    }
    
    public static void find10Even(int number){
        if(number >= 22){
            System.out.println("Done.");
        }
        else{
            System.out.print(number + " ");
            find10Even(2 + number);
        
        }
    }  
}
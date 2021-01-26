
public class Vegeta{
    String yell = "I am the prince of all saiyans.";
    
    public void yell(){
        System.out.println(yell);
    
    }
    public void yell(String sound){
        System.out.println(sound + "!");
    
    }
    public void yell(int iterations){
        for(int i = 0;i < iterations;i++){
            System.out.println(yell);
        }
    }
    
    public static void main(String[] args) {
        Vegeta v = new Vegeta();
        v.yell();
        System.out.println("");
        v.yell("Hello!");
        System.out.println("");
        v.yell(3);
    }
}
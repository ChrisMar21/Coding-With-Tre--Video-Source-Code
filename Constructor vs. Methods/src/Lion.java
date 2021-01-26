
public class Lion{
    int age;
    String name;
    
    public Lion(){
        this.age = 10;
        this.name = "Oscar";
    }
    
    public void growl(){
        System.out.println("Rooorarrr!!!");
    
    }
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.growl();
    }


}
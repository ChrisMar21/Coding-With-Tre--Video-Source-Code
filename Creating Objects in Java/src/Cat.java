import java.util.Random;
public class Cat {
    String name;
    String sounds[];
    public Cat(String name){
        this.name = name;
        sounds =  new String[3];
        sounds[0] = "purrrr";
        sounds[1] = "meow";
        sounds[2] = "growl";
    
    }
    
    public void makeANoise(){
        Random rand = new Random();
        int sound = rand.nextInt(3);
        System.out.println(this.name + " has " + sounds[sound] + "ed.");
        
    
    }
    public static void main(String[] args) {
       Cat cat = new Cat("Tom");
       cat.makeANoise();
        
    }
    
}
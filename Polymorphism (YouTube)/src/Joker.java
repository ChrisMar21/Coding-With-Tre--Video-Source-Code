
public class Joker extends DCCharacters{
    String name;
    
    public Joker(){
        name = "Joker";
        role = "Villain.";
    }
    
    @Override
    public void sayHi(){
        System.out.println("I am " + name + " and I am a " + role);
    
    }

}
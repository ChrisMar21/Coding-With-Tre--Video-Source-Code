
public class Batman extends DCCharacters{
    String name;
    
    public Batman(){
        name = "Batman";
        role = "Hero.";
    }
    
    @Override
    public void sayHi(){
        System.out.println("I am " + name + " and I am a " + role);
    }


}
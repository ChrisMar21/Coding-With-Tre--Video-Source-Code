public class Superman extends DCCharacters{
    String name;
    
    public Superman(){
        name = "Superman";
        role = "Hero.";
        
    }
    
    @Override
    public void sayHi(){
        System.out.println("I am " + name + " and I am a " + role);
    }

}
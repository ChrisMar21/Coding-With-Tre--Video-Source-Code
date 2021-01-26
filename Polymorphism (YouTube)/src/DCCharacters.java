
public class DCCharacters{
    String role = "Hero.";
    
    public void sayHi(){
        System.out.println("I am a DC Character and I am a " + role);
    
    }
    
    public static void main(String[] args) {
        DCCharacters list[] = new DCCharacters[4];
        
        list[0] = new DCCharacters();
        list[1] = new Batman();
        list[2] = new Superman();
        list[3] = new Joker();
        
        for(int i = 0;i < list.length;i++){
            list[i].sayHi();
        
        }
        
    }


}


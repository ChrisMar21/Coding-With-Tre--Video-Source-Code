public class Goku implements ZFighterMoves{
    String name;
    
    Goku(){
        name = "Goku";
    
    
    }

    @Override
    public void kick() {
        System.out.println("Pow!!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void throwKamehameha() {
        System.out.println("Kamehameha!!!!!!");
    }

    @Override
    public void sayName() {
        System.out.println("My Name is Goku");//To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Goku goku = new Goku();
        goku.kick();
        goku.throwKamehameha();
        goku.sayName();
}

}
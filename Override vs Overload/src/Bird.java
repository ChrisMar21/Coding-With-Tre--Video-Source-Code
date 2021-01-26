
public class Bird{
   public void flapWings(){
       System.out.println("This bird flaps wings.");
   }
    static class Cardinal extends Bird{
        public void flapWings(){
            System.out.println("This bird flaps red wings.");
        }
    
    }     

    
    public static void main(String[] args) {
        Cardinal c = new Cardinal();
        c.flapWings();
    }
}
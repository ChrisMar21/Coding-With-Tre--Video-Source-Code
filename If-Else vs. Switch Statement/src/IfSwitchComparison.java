public class IfSwitchComparison{
    public static void main(String[] args) {
        int num = 10;
        
        if(num % 2 == 0){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
        System.out.println("");
        switch(num % 2){
            case 0:
                System.out.println(num + " is even.");
                break;
            default:
                System.out.println(num + " is odd.");
        
        }
       
        
        
        
        
        
        
   }
    


}
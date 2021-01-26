
public class FindLCM2{
    public static void main(String[] args) {
        System.out.println("Least Common Multiple of 16 and 17: " + LCM(16,17));
        
    }
    
    public static int LCM(int number1,int number2){
        int i;
        if(number1 == 0){
            return 0;
        }
        if(number2 == 0){
            return 0;
        }else{
            i = 1;
            while(i < (number1 * number2)){
                if(i%number1 == 0 && i%number2 == 0){
                    break;
                }
                i++;
            }
        }
        return i;
    }
}
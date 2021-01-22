public class NumberReverser{
private int num;

//Constructor takes in a number
NumberReverser(int number){
   this.num = number;

}
public static void main(String[] args) {
   NumberReverser nr = new NumberReverser(13);
   nr.reverseNumber();
}

public void reverseNumber(){
    //Convert Number to String
    //Have a holder to contain reversed integer
    ///String number = String.valueOf(num);
    String number = String.valueOf(num);
    String convertedReversedNumber = "";
    
    for(int i = number.length()-1;i >= 0;i--){
        convertedReversedNumber += number.charAt(i);
    
    }
  
    System.out.println("Original Number: " + num);
    System.out.println("Number Reversed: " 
            + Integer.parseInt(convertedReversedNumber));


}
}
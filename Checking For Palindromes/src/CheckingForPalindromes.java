import java.util.Scanner;
public class CheckingForPalindromes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word that could be a palindrome: ");
        String word = input.next();
        isPalindrome(word);
    }
public static void isPalindrome(String word){
    String reversedWord = "";
    for(int i = word.length()-1;i >=0;i--){
        reversedWord += word.charAt(i);
    
    }
    if(reversedWord.equals(word)){
        System.out.println(word + " is a palindrome.");
    }else{
        System.out.println(word + " is not palindrome.");
    
    }
    
    
  }
}
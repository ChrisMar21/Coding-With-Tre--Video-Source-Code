public class ArrayinAlphabeticalOrder{
    public static void main(String[] args) {
        String[]array = {"Zoe","Brad","Kyle","Chris","Adam"};
        putInAlphabeticalOrder(array);
    }
    
    public static void putInAlphabeticalOrder(String[]array){
        for(int i = 0;i < array.length;i++){
            for(int j = i + 1;j < array.length;j++){
                if(array[i].compareTo(array[j]) > 0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                
                }
            }
        }
        
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        
        }
        
    }
    
    
}
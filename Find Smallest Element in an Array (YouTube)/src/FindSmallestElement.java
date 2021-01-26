public class FindSmallestElement{
    
    public static void main(String[] args) {
        int array[] = {500,2000,23,5,2,100000,70};
        findMin(array);
}
    public static void findMin(int[]array){
        int min = array[0];
        
        for(int i = 0;i < array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Your Smallest Element is: " + min);
    }
    

}
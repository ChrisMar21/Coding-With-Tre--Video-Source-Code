public class FindingDuplicateProgram{
    public static void main(String[] args) {
        int array[] = {1,2,5,6,7,5};
        findDuplicates(array);
  }
   
    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 0;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
   
    public static void findDuplicates(int[] array){
        int[]occurences = new int[findMax(array) * 2];
        
        for(int i = 0;i < array.length;i++){
            occurences[array[i]]++;
        }
    
        for(int i = 0;i < occurences.length;i++){
            if(occurences[i] <= 1){
                continue;
            }
            else{
                System.out.println("The Duplicates Are: " + array[i]);
            }
        
        }
    }
    
    
}
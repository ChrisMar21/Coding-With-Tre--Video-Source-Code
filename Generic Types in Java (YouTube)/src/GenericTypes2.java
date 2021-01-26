public class GenericTypes2<T extends Number>{
    T data;
    GenericTypes2(T data){
        this.data = data;
    
    }
    
    public void printNumber(Number num){
        System.out.println("Your number is " + num);
    
    }
    
    public static void main(String[] args) {
        GenericTypes2<Integer> gt = new GenericTypes2(23);
        GenericTypes2<Double> gt2 = new GenericTypes2(2.0);
        
        gt.printNumber(55.34);
}


}
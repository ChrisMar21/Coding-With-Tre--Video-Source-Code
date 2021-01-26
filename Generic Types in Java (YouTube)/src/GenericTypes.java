
public class GenericTypes<T> {
        T data;
        GenericTypes(T data){
            this.data = data;
        }
        public void sayName(){
            System.out.println("My name is " + this.data);
        
        }
    public static void main(String[] args) {
        GenericTypes<Integer> gt = new GenericTypes(10);
        gt.sayName();
        
        GenericTypes<String> gt2 = new GenericTypes("Steve Austin");
        gt2.sayName();
        
        
    }
    
        
}


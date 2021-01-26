import java.util.Hashtable;
public class HashTableVideo{
    public static void main(String[] args) {
        Hashtable <String,String> ht = new Hashtable<>();
        ht.put("Goku", "Saiyan");
        ht.put("Vegeta", "Saiayn");
        ht.put("Joker", "DC Villain");
        ht.put("Piccolo", "Namekian");
        ht.replace("Vegeta","Stubborn");
        
        for(String key: ht.keySet()){
            System.out.println(key + " -> " + ht.get(key));
        }
                
    }


}
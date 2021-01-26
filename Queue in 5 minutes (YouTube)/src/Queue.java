
public class Queue{
    int size;
    int front;
    String[]list;
    public Queue(){
        this.size = 5;
        front = 0;
        list = new String[5];
    }
    
    public void enQueue(String data){
            int i = front;
            for(i = front;i < list.length;i++){
                if(list[i] == null){
                    list[i] = data;
                    break;
                }
            }       
    }
    
    public void deQueue(){
        list[front] = null;
        front++;
    }
    
    public void printQueue(){
        for(String item: list){
            if(item == null){
                continue;
            }
            System.out.print(item + " -> ");
        }
        System.out.print("End of the line.");
        System.out.println("");
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue("Goku");
        queue.enQueue("Vegeta");
        queue.enQueue("Gohan");
        queue.enQueue("Piccolo");
        queue.enQueue("Yamcha");
        queue.deQueue();
        queue.printQueue();
    }
}
public class SinglyLinkedList<T>{
    Node head;
    static class Node<T>{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void add(Node n){
        if(head == null){
            head = n;
        }
        else if(head != null){
            n.next = head;
            head = n;
        
        }
    }
    
    public void delete(Node n){
        if(n == null){
            System.out.println("Doesn't exist.");
        }
        Node temp = n.next;
        n.data = temp.data;
        n.next = temp.next;
        temp = null;
        
    
    }
    
    public void printNodes(){
        if(head == null){
            System.out.println("List is empty.");
        
        }
        else if(head != null){
            while(head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println("");
        }
    
    }
    
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList();
        Node piccolo = new Node("Piccolo");
        Node gohan = new Node("Gohan");
        Node vegeta = new Node("Vegeta");
        Node goku = new Node("Goku");
        
        list.add(piccolo);
        list.add(gohan);
        list.add(vegeta);
        list.add(goku);
        
        list.delete(gohan);
        list.printNodes();
        
        
        
        
        
    }
}
public class DoublyLinkedList{
   Node head;
    static class Node<T>{
        T data;
        Node prev;
        Node next;
        public Node(T data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public void add(Node n){
        n.next = head;
        n.prev = null;
        
        if(head != null){
            head = head.next;
        }
        head = n;         
    }

    public void delete(Node n){
        if(n == null){
            System.out.println("Doesn't exist.");
        }
        if(head == null){
            System.out.println("List is empty.");
        }
        if(head.equals(n)){
            head = head.next;
        }
        else if(!head.equals(n)){
            Node currentNode = head;
            while(currentNode != null){
                if(!currentNode.equals(n)){
                    currentNode = currentNode.next;
                }
                else if(currentNode.equals(n)){
                    try{currentNode.prev.next = currentNode.next;
                    currentNode.prev = null;
                    }catch(NullPointerException ex){
                        System.out.println("");
                    }
                    
                    try{
                        currentNode.next.prev = currentNode.next;
                        currentNode.prev = null;
                    }catch(NullPointerException e){
                        System.out.println("");
                    }
                    break;
                }
            } 
        }
    }
    public void printNodes(){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("End of the list.");
        System.out.println("");
    }
    
    public static void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
            Node eddy = new Node("Eddy");
            Node edd = new Node("Edd");
            Node ed = new Node("Ed");
            
            list.add(eddy);
            list.add(edd);
            list.add(ed);
            list.delete(eddy);
            list.printNodes();
        
        
        
}
}
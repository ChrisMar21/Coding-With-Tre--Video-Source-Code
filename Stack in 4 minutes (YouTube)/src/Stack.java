public class Stack<T>{
    Node top;
    static class Node<T>{
        T data;
        Node next;
        
        public Node(T data){
            this.data = data;
        }
    }
    public void push(T data){
        if(top == null){
            top = new Node(data);
        }
        else if(top != null){
            Node item = new Node(data);
            item.next = top;
            top = item;
        }
    }
    public void peek(){
        System.out.println(top.data);
    }
    
    public void pop(){
        top = top.next;
    }
   
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("One Piece");
        stack.push("Naruto");
        stack.push("Dragonball Z");
        stack.pop();
        stack.pop();
        stack.peek();
        
        
        
        
 }
 
    
}
package com.org.ds;

public class StackLL {
    
    private Node head;
    private Node last;
    
    static class Node{
        private int data;
        private Node next;
        
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        
    }
    
    public boolean isEmpty(){
        
        if(head == null) 
            return true;
        else 
            return false;
    }
    
    public void push(int data){
        StackLL.Node node = new StackLL.Node();
        node.setData(data);
        node.setNext(null);
        if (isEmpty()) {

            this.head=node;
            this.last=head;
        }else{
            last.setNext(node);
            last=last.getNext();
        }
    }
    
    public void pop(){
        StackLL.Node current=head;
        
        if(!isEmpty()){
            while(current.getNext() !=last){
                current = current.getNext();
            }
            current.setNext(null);
            last=current;
        }
       
    }
    
    public int top(){
        return last.data;
    }
    
    public static void main(String args[]){
        StackLL s= new StackLL();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        
    }

}

package com.org.ds.Ll;

public class SearchLL {
    
    public static boolean findByItr(LL.Node head, int data){
        LL.Node current=head;
        while(current!=null){
            
            if(data==current.getData()){
                return true;
            }else{
                current=current.getNext();
            }
        
        }
        return false;
    }
    
    public static boolean findByRec(LL.Node head, int data){
        if(head==null)
            return false;
        else{
            if(data==head.getData())
                return true;
            else
                return findByRec(head.getNext(), data);
            
        }
        
    }
    
    public static void main(String args[]){
        LL list = new LL();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(findByRec(list.head, 5));
        System.out.println(findByRec(list.head, 3));
        
        System.out.println(findByItr(list.head, 5));
        System.out.println(findByItr(list.head, 3));
        
    }
}

package com.org.ds.Ll;

public class NumOfNodesLL {
    
    public static int countNodesRec(LL.Node node){
        if(node==null){
            return 0;
        }
        return 1+countNodesRec(node.getNext());
        
    }
    
    public static int countNodesItr(LL.Node node){
        int count=0;
        if(node!=null)
            count++;
        
        while(node.getNext()!=null){
            count++;
            node=node.getNext();
        }
        
        return count;
    }
    
    public static void main(String args[]){
        LL list = new LL();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(countNodesRec(list.head));
        System.out.println(countNodesItr(list.head));
        NthNodeFromEnd(list.head, 2);
    }
    //not working
    public static void NthNodeFromEnd(LL.Node head, int n){
        int len=0;
        while (head != null)
        {
            head = head.getNext();
            len++;
        }
        
        if(n>len)
            return ;
        int targetPosition=len-n;
        
        for(int i=0; i<len; i++){
            if(i==targetPosition){//0,1,2,4
                System.out.println(head.getData());
            }
            if(head!=null)
                head=head.getNext();
            
        }

    }
}

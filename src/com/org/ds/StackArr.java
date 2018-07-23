package com.org.ds;

public class StackArr {
    
    private int index=-1;
    private static final int MAX=1000;
    private int obj[] =new int[MAX];
    
   /* public  StackArr() {
          index=-1;
    }*/
    
    public boolean push(int a){
        if(index>=MAX+1) 
            return false;
        else {
             index= index+1;

            obj[index] = a;
            return true;
        }
    }
    
    public int top(){
        return obj[index];
    }
    
    public int pop(){
        if(index<0)
            return 0;
        else{
            int x=obj[index--];
            return x;
        }
        
    }
    
    public static void main(String args[]){
        StackArr s= new StackArr();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.index);
        
        StackArr s2= new StackArr();
        System.out.println(s2.index);
        
        
    }

}

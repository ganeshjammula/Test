package com.org.ds.Ll;

public class LLarr {
    
    private int index=-1;
    private static final int MAX=1000;
    private int obj[] =new int[MAX];
    
    
    public void add(int data){
        obj[index++]= data;
    }

 
}

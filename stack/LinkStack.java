package com.stack;
public class LinkStack {

    private Nodelist theList;
    public LinkStack(){
        theList = new Nodelist();
    }
    public void push(int j){
        theList.node_addfront(j);
    }
    public int pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack (top --> bottom): ");
        theList.display_print();
    }
}

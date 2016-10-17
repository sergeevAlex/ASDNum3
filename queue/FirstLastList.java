package com.queue;
public class FirstLastList {
    public NodeL first;
    public NodeL last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
    return first==null;}

    public void insertLast(int id){
        NodeL nd = new NodeL(id);
        if(isEmpty())
            first = nd;
        else
            last.next=nd;
        last= nd;
    }

    public int deleteFirst()
    {
            int temp = first.iData;
            if (first.next == null)
                last = null;
            first = first.next;
            return temp;
    }

    public void delete(int key)
    {

    }
    public void displayList(){
        NodeL current = first;
        while (current!=null)
        {
            current.node_print();
            current= current.next;
        }
        System.out.println("");
    }

    public int getElem(){
        int current;
        current = first.iData;
        return current;
    }

}

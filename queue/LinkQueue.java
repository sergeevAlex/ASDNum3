package com.queue;
public class LinkQueue {
    private FirstLastList theList;
    public LinkQueue(){
        theList = new FirstLastList();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void enqueue(int id){
        theList.insertLast(id);
    }
    public int dequeue()
    {return theList.deleteFirst();}

    public void displayQueue(){
        System.out.print("Queue (front-->rear): ");
        System.out.println();
        theList.displayList();
    }

    public void free() {

        while (theList != null)
        {
        theList.deleteFirst();
        }

    }

    public int getElem(){
        return theList.getElem();
    }

    public int size(){
        int size=1;
        while (theList != null){
            size++;
        }
        return size;
    }

}

package com.queue;
public class Nodelist {
    private NodeL first;
    public Nodelist(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void node_addfront(int id){
        NodeL newNodeL = new NodeL(id);
        newNodeL.next = first;
        first = newNodeL;
    }
    public void display_print(){
        System.out.println("List (first --> last): ");
        NodeL current = first;
        while (current != null){
            current.node_print();
            current = current.next;
        }
        System.out.println("");
    }
        }
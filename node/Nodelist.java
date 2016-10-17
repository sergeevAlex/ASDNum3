package com.node;

public class Nodelist {
    private NodeL first;
    public Nodelist(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void node_addfront(int id,String sd){
        NodeL newNodeL = new NodeL(id,sd);
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
    public NodeL node_lookup(int key){
        NodeL current = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
        }

        public NodeL delete(int key){
            NodeL current = first;
            NodeL previous = first;
            while (current.iData != key){
            if(current.next == null)
                return null;
                else {
                    previous = current;
                current = current.next;
                }
            }
            if(current == first)
                first = first.next;
            else
                previous.next=current.next;
            return current;
        }
        public void addend(int id,String sd){
            NodeL nd = new NodeL(id,sd);
            NodeL current = first;
            if (first != null)
            {
                current = first;
                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = nd;
            }
            else first = nd;
        }
        }
package com.stack;
public class NodeL {
    public int iData;
    public NodeL next;

    public NodeL(int id) {
        iData = id;
    }
    public void node_print()
    {
        System.out.println("[Value = " + iData+"]");
    }
}

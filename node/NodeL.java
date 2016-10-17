package com.node;
public class NodeL {
    public int iData;
    public String sData;
    public NodeL next;

    public NodeL(int id, String sd) {
        iData = id;
        sData = sd;
    }
    public void node_print()
    {
        System.out.println("[Data = " + sData + ", value = " + iData+"]");
    }

}

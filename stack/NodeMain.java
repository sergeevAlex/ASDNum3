package com.stack;
public class NodeMain {
public static void main(String[] args)
{
    LinkStack stack = new LinkStack();
for(int i = 1; i <= 8;i++) {
    stack.push(i);
}
stack.displayStack();
    System.out.println("4 последние элемента");
    for (int i =1; i <=4;i++)
    {
        System.out.println(stack.pop());
    }
}
    }
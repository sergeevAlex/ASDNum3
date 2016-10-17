package com.node;

public class NodeMain {
public static void main(String[] args)
{
    Nodelist nd = new Nodelist();
    for(int i = 20;i>=1;i--)
    {
        nd.node_addfront(i,"A");
    }

    // <----Тестирование списка---->
    nd.display_print();
    System.out.println("Функция удаления");
    nd.delete(11);
    System.out.println();
    nd.display_print();
    System.out.println("Функция добавления в конец списка");
    nd.addend(100,"B");
    nd.display_print();
    System.out.println("");
}
    }
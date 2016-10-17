package com.queue;

import java.util.Scanner;

public class QueueMain {

    public static int min(int a,int b, int c){
        int vs;
        if(a<b) vs = a;
        else vs =b;
        if(c<vs) vs = c;
        return vs;
    }

public static void main(String[] args) {
    Nodelist nd = new Nodelist();
    for (int i = 20; i >= 1; i--) {
        nd.node_addfront(i);
    }
    LinkQueue queue = new LinkQueue();
    for (int i = 0; i < 10; i++) {
        queue.enqueue(i);
    }
    queue.displayQueue();
    System.out.println("Первые 5 элементов: ");
    for (int i = 0; i < 5; i++) {
        System.out.println(queue.dequeue());
    }

    System.out.println("Введите количество натуральных чисел: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //Индивидуальное:
    LinkQueue two = new LinkQueue();
   // two = null;
    LinkQueue three = new LinkQueue();
   // three = null;
    LinkQueue five = new LinkQueue();

   // five = null;
//    for(int i = 1;i <= n;i ++) {
//        two.enqueue(i);
//        if(two.getElem()%2 == 0){
//            three.enqueue(two.getElem());
//            two.dequeue();
//        }
//        else two.dequeue();
//    }
////    for(int i = 1;i <three.size();i++)
////    {
////        if(three.getElem()%3 == 0){
////            five.enqueue(three.getElem());
////            three.dequeue();
////        }
////        else three.dequeue();
////
////    }
//
//    while (!three.isEmpty())
//    {
//        if(three.getElem()%3 == 0){
//            five.enqueue(three.getElem());
//            three.dequeue();
//        }
//        else three.dequeue();
//    }
//    System.out.println("Первые n натуральных чисел в разложении которых: ");
//    while (!five.isEmpty())
//    {
//        if(five.getElem()%5 == 0){
//            System.out.println(five.dequeue());
//        }
//        else five.dequeue();
    int x;
    two.enqueue(1*2);
    three.enqueue(1*3);
    five.enqueue(1*5);
    for (int i = 1; i <= n; i++)
    {x = min(two.getElem(),three.getElem(),five.getElem());
        System.out.println(x);
        two.enqueue(x*2);
        three.enqueue(x*3);
        five.enqueue(x*5);
        if(x == two.getElem()) two.dequeue();
        if(x == three.getElem()) three.dequeue();
        if(x == five.getElem()) five.dequeue();

    }


    }



}

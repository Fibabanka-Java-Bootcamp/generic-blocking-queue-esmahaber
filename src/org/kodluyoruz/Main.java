package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        QueueList<Integer> myList =new QueueList<>();

        myList.add(1);
        myList.add(2);


        System.out.println(myList.poll());
        System.out.println(myList.poll());
        System.out.println(myList.peek());
        System.out.println(myList.peek());
        System.out.println(myList.poll());
        System.out.println(myList.peek());
        System.out.println(myList.poll());
        System.out.println(myList.peek());

    }
}

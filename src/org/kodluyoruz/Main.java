package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        QueueList<Integer> myList =new QueueList<>();

        QueueList<String> myList1 =new QueueList<>();

        Thread addThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList.add(1);
                }
            }
        });

        Thread addThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList.add(2);
                }
            }
        });

        Thread addThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList.add(3);

                }
            }
        });

        Thread addThread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList.add(4);

                }
            }
        });

        Thread addThread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList.add(5);

                }
            }
        });

        Thread addThread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList1.add("kodluyoruz");
                }
            }
        });

        Thread addThread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    myList1.add("bootcamp");
                }
            }
        });

        Thread peekThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(myList.peek());
                }

            }
        });

        Thread pollThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(myList.poll());
                }

            }
        });

        Thread peekThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(myList.peek());
                }

            }
        });

        Thread pollThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(myList1.poll());
                }

            }
        });

        Thread peekThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    System.out.println(myList1.peek());
                }

            }
        });

        try {
            addThread1.start();
            addThread2.start();
            addThread3.start();
            addThread4.start();
            addThread5.start();
            addThread6.start();
            addThread7.start();

            peekThread1.start();
            pollThread1.start();
            peekThread2.start();
            pollThread2.start();
            peekThread3.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}

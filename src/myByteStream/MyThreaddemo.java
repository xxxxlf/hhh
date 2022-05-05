package myByteStream;

public class MyThreaddemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("线程1");
        my2.setName("线程2");

//        System.out.println(my1.getPriority());
//        System.out.println(my2.getPriority());

//        my1.setPriority(10);
        Thread.currentThread().setName("线程3");
        my1.setDaemon(true);
        my2.setDaemon(true);
        my1.start();
        my2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

package myByteStream;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
//            try {
////                Thread.sleep((long) 1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class Thread_Schedular extends Thread{
    public  void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread_Schedular t1 = new Thread_Schedular();
        Thread_Schedular t2 = new Thread_Schedular();
        Thread_Schedular t3 = new Thread_Schedular();
        Thread_Schedular t4 = new Thread_Schedular();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
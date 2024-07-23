package MultiThreading;
class MyThread1 extends Thread
{
public void run()
{
    System.out.println("Thread start1");
}
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread start2");
    }
}
public class multipletask_multiplethread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

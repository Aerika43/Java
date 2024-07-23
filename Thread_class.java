package MultiThreading;
//In this method we have to extend the thread class and override the run() method.
//In Thread Class there are Many Methods
// run() and start() is predefined!
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Start");
    }
}
public class Thread_class {
    public static void main(String[] args) {
        
        MyThread t = new MyThread();
        t.start();
    }
}

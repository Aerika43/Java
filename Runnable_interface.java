package MultiThreading;
//in this method we have to implement thr runnable interface and override
//in runnable interface here is only one method run();
//implements (multiple inheritance) 

//runnable is easy to use then thread 
//because  runnable interface one methods 
 
class myThread implements Runnable
{
    public void run()
    {
        System.out.println("Thread Start");
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        myThread t = new myThread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}

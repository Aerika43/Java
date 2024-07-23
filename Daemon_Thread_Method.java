package MultiThreading;
/*Which is run in the background of another thread
It provides services to the threads
Daemon thread is depend on the main function
Ex : ErrorHandling , Spellchecker
Methods
  -public final void setDaemon(boolean b)
  -public final void isDaemon()*/

class Test extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread");
        }
        else
        {
            System.out.println("Child Thread");
        }
    }
}   
public class Daemon_Thread_Method {
    
    public static void main(String args[])
    {
        System.out.println("Main Thread");
        Test t = new Test();
        t.setDaemon(true); //t.setDaemon(false);
        t.start();
    }
}


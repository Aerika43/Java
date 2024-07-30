package MultiThreading;
/*
1. Interrupt method is used to interrupt the thread. It is used to stop the thread in the middle of the execution
2. Interrupt() method will only works when the thread is in sleeping or waiting state
3. If the thread is not in sleeping or waiting state then calling an interrupt method will perform normal behavior
4. Interrupt method will throw an exception Interrupted Exception
*/

class interrupt extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
    }
}  
    
public class Interrupt_Thread_Method {
    public static void main(String args[])
    {
        interrupt t = new interrupt();
        t.start();
        t.interrupt();
    }
}

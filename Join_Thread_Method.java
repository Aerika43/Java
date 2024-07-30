package MultiThreading;
//If a thread wants to wait for another thread to complete its task then we should use join() method
//
//Join() method is used to wait for the completion of a thread

class Test1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Child Thread "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
    }
    
}
public class Join_Thread_Method {
    public static void main(String args[]) throws InterruptedException
    {
        Test1 t1 = new Test1();
        t1.start();
        t1.join();
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
    }
}

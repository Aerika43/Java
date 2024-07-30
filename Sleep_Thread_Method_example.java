package MultiThreading;

class example extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}    
public class Sleep_Thread_Method_example {
    public static void main(String args[])
    {
        example t1 = new example();
        t1.start();
        example t2 = new example();
        t2.start();
    }
}

    

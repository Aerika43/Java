package MultiThreading;
class Tests extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);  //millisecond me run hoga
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class Sleep_Thread_Method {
   
    public static void main(String[] args)
    {
        Tests t1 = new Tests();
        t1.start();
    }
}

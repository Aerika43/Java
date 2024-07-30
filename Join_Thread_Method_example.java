package MultiThreading;
class Medical extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Medical Start....");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        }
        catch(Exception e)
        {
             System.out.println("Error :"+e);
        }
    }
}
class TestDriver extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Test Drive Start....");
            Thread.sleep(5000);
            System.out.println("Test Drive Completed");
        }
        catch(Exception e)
        {
             System.out.println("Error :"+e);
        }
    }
}
class OfficerSign extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Officer takes the files....");
            Thread.sleep(3000);
            System.out.println("Officers Work Completed");
        }
        catch(Exception e)
        {
             System.out.println("Error :"+e);
        }
    }
}

public class Join_Thread_Method_example {
     public static void main(String args[]) throws InterruptedException
    {
        Medical m1 = new Medical();
        m1.start();
        m1.join();

        TestDriver t1 = new TestDriver();
        t1.start();
        t1.join();

        OfficerSign o1 = new OfficerSign();
        o1.start();
    }
}

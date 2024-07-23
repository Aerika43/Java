package MultiThreading;

public class Thread_getname_setname extends Thread{
@Override
public void run()
{
    System.out.println("Thread is excecuted by"+Thread.currentThread().getName());
}

    public static void main(String[] args) {
        System.out.println("Hello is printed by"+Thread.currentThread().getName());
        Thread_getname_setname t1 = new Thread_getname_setname();
        t1.setName("JAVA");
        t1.start();
        
        Thread_getname_setname t2 = new Thread_getname_setname();
        t2.setName("Lecture");
        t2.start();
    }
}

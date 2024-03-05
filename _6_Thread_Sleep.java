class Thread1 extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": " +i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for(int i=6; i<=10; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": " +i);
                Thread.sleep(400);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class _6_Thread_Sleep {

    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.start();   
        Thread2 th2=new Thread2();
        th2.start();
        
        Thread1 th3=new Thread1();
        th3.run(); //not thread anymore. mehod 1
        Thread2 th4=new Thread2();
        th4.run(); //method 2
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("thread_1 check");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("thread_2 check");
    }
}

public class _2_Thread_Execution_Causes {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.start();
        Thread1 th2=new Thread1();
        th2.start();
        Thread2 th3=new Thread2();
        th3.start();
    }
}
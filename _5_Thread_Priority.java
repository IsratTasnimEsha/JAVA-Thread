public class _5_Thread_Priority extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        _5_Thread_Priority th1=new _5_Thread_Priority();
        th1.start();

        Thread.currentThread().setPriority(7);
        _5_Thread_Priority th2=new _5_Thread_Priority();
        th2.start();

        _5_Thread_Priority th3=new _5_Thread_Priority();
        th3.setPriority(10);
        th3.start();
    }
}

//Doesn't work on Windows
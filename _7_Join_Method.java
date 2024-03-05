public class _7_Join_Method extends Thread{
    static Thread mainThread;

    public void run() {
        try {
            mainThread.join(); //thread-0 will wait for main to be completed
            for(int i=1; i<=5; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": " +i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        mainThread=Thread.currentThread();

        _7_Join_Method th=new _7_Join_Method();
        th.start();
        th.join(); //main will wait for thread-0 to be completed

        try {
            for(int i=1; i<=5; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": " +i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

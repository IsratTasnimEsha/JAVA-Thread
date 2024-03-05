class _1_CreateThread extends Thread
{
    public void run() {
        System.out.println("thread check");
    }

    public static void main(String[] args) {
        _1_CreateThread ct= new _1_CreateThread();
        ct.start();
        //ct.start(); //dead thing can't be invoked again
    }
}


/*
class _1_CreateThread implements Runnable
{
    public void run() {
        System.out.println("thread check");
    }

    public static void main(String[] args) {
        _1_CreateThread ct= new _1_CreateThread();
        Thread th=new Thread(ct);
        th.start();
    }
}
*/

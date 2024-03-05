/*
public class _4_Daemon_Thread extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) System.out.println("Daemon Thread");
        //else System.out.println("Child  Thread");
    }
    public static void main(String[] args) {
        _4_Daemon_Thread dt1= new _4_Daemon_Thread();
        dt1.setDaemon(true);
        dt1.start(); //Daemon Thread of Main. Main executes nothing so Daemon will not work
        System.out.println("\n");

        System.out.println("Main Thread"); //Now Daemon will execute too

        _4_Daemon_Thread dt2=new _4_Daemon_Thread();
        dt2.start();
        
        _4_Daemon_Thread dt3=new _4_Daemon_Thread();
        dt3.setDaemon(true);
        dt3.start(); //Eta Main Thread er i Daemon
    }
}
*/

public class _4_Daemon_Thread extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) System.out.println("Daemon Thread");
        //else System.out.println("Child Thread");
    }
    public static void main(String[] args) {
        _4_Daemon_Thread dt2=new _4_Daemon_Thread();
        dt2.start();
        
        _4_Daemon_Thread dt3=new _4_Daemon_Thread();
        dt3.setDaemon(true);
        dt3.start(); //Eta Thread2 er Daemon
    }
}
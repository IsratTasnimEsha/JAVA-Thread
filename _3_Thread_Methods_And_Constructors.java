public class _3_Thread_Methods_And_Constructors extends Thread{
    public void run() {
        //Thread.currentThread().setName("Esha-1");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread.currentThread().setName("Esha");
        System.out.println(Thread.currentThread().getName());

        _3_Thread_Methods_And_Constructors th1=new _3_Thread_Methods_And_Constructors();
        th1.start();

        _3_Thread_Methods_And_Constructors th2=new _3_Thread_Methods_And_Constructors();
        th2.setName("Esha-1");
        th2.start();

        _3_Thread_Methods_And_Constructors th3=new _3_Thread_Methods_And_Constructors();
        th3.start();
    }    
}

/*
Output:
Esha
Thread-0
Thread-2
Esha-1

Output:
Esha
Thread-0
Esha-1
Thread-2

CPU er iccha kake age nibe
 */
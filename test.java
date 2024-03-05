import java.util.Scanner;

//import java.util.Scanner;

class one extends Thread {
    int n;

    one(int m) {
        n = m;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

class square extends Thread {
    int n;

    square(int m) {
        n = m;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
            sum += i * i;
        }
        System.out.println("Sum: " + sum);
    }
}

class cube extends Thread {
    int n;

    cube(int m) {
        n = m;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i * i);
            sum += i * i * i;
        }
        System.out.println("Sum: " + sum);
    }
}

public class test {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        one _o = new one(n);
        _o.start();
        try {
            _o.join();
        } catch (Exception e) {
        }

        square _s = new square(n);
        _s.start();
        try {
            _s.join();
        } catch (Exception e) {
        }

        cube _c = new cube(n);
        _c.start();
        try {
            _c.join();
        } catch (Exception e) {
        }
    }
}
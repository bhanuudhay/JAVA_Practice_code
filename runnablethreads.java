class A implements Runnable {
    public void run() { // every method has a run method
        for (int i = 1; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } // we can also thread to wait
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

class B implements Runnable {
    public void run() { // every method has a run method
        for (int i = 1; i < 100; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } // we can also thread to wait
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

public class runnablethreads {
    public static void main(String[] args) {
        Runnable obj = new A();
        Runnable obj2 = new B();

        Thread th = new Thread(obj);
        Thread th1 = new Thread(obj2);

        // obj.start();
        // obj2.start();
        th.start(); // it still not able to figure that us refereing to where then we need to pass
                    // argumet
        th1.start();

    }
}
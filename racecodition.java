class Counter {
    int count;

    public synchronized void increment() { // to prevent from race around condition
        count++;
    }
}

public class racecodition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable object1 = () -> {
            for (int i = 1; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable object2 = () -> {
            for (int i = 1; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(object1);
        Thread t2 = new Thread(object2);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println(c.count); // This should print 200
    }
}

package thread;

public class Deadlock {

    /**
     *
     * Main method of the class for the following question:
     *    Create a deadlock Scenario Programmatically in Java.
     * </br>
     * </br>
     * NOTE: </br>
     * ------ </br>
     * Deadlocks are a common problem in multithreaded applications.</br>
     * Deadlocks may not happen every time you run the program, due to thread scheduling. However, with the given locking order, there is a high probability of encountering a deadlock in a typical environment. You can increase the Thread.sleep(100); duration to make the chance of deadlock more probable. </br>
     * For diagnosing deadlocks in a real application, consider using tools like VisualVM or JConsole, which can help you visualize thread states in JVM.</br>
     * ------
     * */
    public static void main(String[] args) throws InterruptedException {

        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        Thread thread1 = new Thread(new SynchronizedThread(object1, object2), "Thread-1");
        Thread thread2 = new Thread(new SynchronizedThread(object2, object3), "Thread-2");
        Thread thread3 = new Thread(new SynchronizedThread(object3, object1), "Thread-3");

        thread1.start();
        Thread.sleep(5000);
        thread2.start();
        Thread.sleep(5000);
        thread3.start();

    }
}

class SynchronizedThread implements Runnable {

    private final Object object1;
    private final Object object2;

    public SynchronizedThread(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    /**
     * This method is the implementation of the Runnable interface's run method.
     * It simulates a thread waiting for and acquiring two objects in a synchronized manner.
     *
     */
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " waiting for " + object1);
        synchronized (object1) {
            System.out.println(threadName + " got " + object1);
            work();
            System.out.println(threadName + " waiting for " + object2);
            synchronized (object2) {
                System.out.println(threadName + " got " + object2);
                work();
            }
            System.out.println(threadName + " done for " + object2);
        }
        System.out.println(threadName + " done for " + object1);
        System.out.println(threadName + " finished");
    }

    /**
     * Simulates a delay in the execution of the current thread.
     *
     */
    private void work() {
        try {
            Thread.sleep(8000); // increase the sleep time to make the deadlock more probable
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package myjava.multithreading;

/**
 * @author Vishnu Kandanelly
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        /* calling start method of a Thread class
         * and this start method will internally call the run method
         *
         * */
        hi.start();
        /*
         * We have to add the delay to eliminate the random scheduling of thread by the cpu scheduler.
         * because without the delay both the threads reach at same time for execution and scheduler randomly
         * chooses which one to execute first.
         * */
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        hello.start();
    }

}

class Hi extends Thread {

    /*
     *this run method should always be public.
     * Whenever we create a thread, it is mandatory to override the run method
     * of a Thread class which implements the abstract run method of a Runnable interface
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

}

class Hello extends Thread {
    /*
     *this run method should always be public.
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}



package core.multithreading;

/**
 * @author Vishnu Kandanelly
 */
public class RunnableImpl {
    public static void main(String[] args) {

        /*
         * Another way to achieve the same functionality is by
         * creating the upstocking reference variable of Runnable variable
         * @example:
         * Runnable objHallo = new Hallo();
         * Runnable objMoin = new Moin();
         *
         *  Thread threadHallo = new Thread(objHallo);
         *  Thread threadMoin = new Thread(objMoin);
         *
         * but in this particular example, as we are not using objHallo and objMoin anywhere,
         * I have taken the first approach
         * */

        Thread threadHallo = new Thread(new Hallo());
        Thread threadMoin = new Thread(new Moin());

        /* calling start method of a Thread class
         * and this start method will internally call the run method
         *
         * */

        threadHallo.start();
        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }
        threadMoin.start();

    }
}

class Hallo implements Runnable {

    /*
     *this run method should always be public.
     * Whenever we create a thread, it is mandatory to override the run method
     * of a Thread class which implements the abstract run method of a Runnable interface
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hallo...");
            try {
                Thread.sleep(500);
            } catch (Exception ignored) {
            }
        }
    }

}

class Moin implements Runnable {
    /*
     *this run method should always be public.
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Moin...");
            try {
                Thread.sleep(500);
            } catch (Exception ignored) {
            }
        }
    }
}

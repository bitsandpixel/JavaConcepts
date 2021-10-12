package myjava.multithreading;

/**
 * We will be using Anonymous classes and lambda expressions here to achieve the same output here.
 * Also included different ways to create Anonymous threads.
 *
 * @author Vishnu Kandanelly
 */
public class RunnableLambda {


    public static void main(String[] args) throws InterruptedException {

        /*
         * Anonymous class for Thread Hey
         * Here I am not creating complete anonymous to understand
         * the step by step process of optimizing the code till its final form
         * */

        //Anonymous new Runnable can be replaced with lambda.
        Runnable hey = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hey");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {
                }
            }
        };
        Thread threadHey = new Thread(hey, "Thread Hey");



        /*
         * Anonymous class for printing Hi
         * In the above example we are not using the hey object only once so we can even optimize code using lambda
         * and make it a fully anonymous class of thread
         * */
        Thread threadHi = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {
                }
            }
        });

        /*
         * Anonymous class for printing Hello
         * Another way of creating anonymous class
         * */

        Thread threadHello = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {
                }
            }
        });


        /*
         * we can also name the threads which would be useful to keep the track of threads
         * there are two ways to do that work
         * 1. by using setName method (@example: threadHi and threadHello)
         * 2. by passing the name parameter along with runnable object parameter
         *    when creating a thread object (@example: threadBye)
         * */


        threadHi.setName("Thread Hi");
        threadHello.setName("Thread Hello");

        /*we can use also set priority to thread*/

        threadHi.setPriority(Thread.MIN_PRIORITY);
        threadHello.setPriority(Thread.MAX_PRIORITY);


        /* calling start method of a Thread class
         * and this start method will internally call the run method
         *
         * */

        threadHey.start();
        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }
        threadHi.start();
        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }
        threadHello.start();

        /*
         * If we have to run a new thread after finishing the old threads we have to use join function
         * which waits for the current thread to die before running a new thread
         */

        threadHey.join();
        threadHi.join();
        threadHello.join();

        /*
         * we can use isAlive method to check is the current thread is alive or not
         * in this particular example isAlive method is redundant as we are using join method.
         * just printing the result to cover the topic.
         * */

        System.out.println("is Thread Hey Alive: " + threadHey.isAlive());
        System.out.println("is Thread Hi Alive: " + threadHi.isAlive());
        System.out.println("is Thread Hello Alive: " + threadHello.isAlive());


        /*Anonymous class for Bye thread
         * default priority would be NORM_PRIORITY
         * another variation: calling the start method on the anonymous class
         * */
        new Thread(() -> {
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye");
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {
                }
            }
        }, "Thread Bye").start();

        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }

        /*
         * Another way of creating Anonymous class for Ciao Thread
         * where you set name and priority while creating the thread without using lambda expression
         * */
        Thread threadCaio = new Thread() {
            @Override
            public void run() {
                setName("Thread Ciao");
                setPriority(Thread.MAX_PRIORITY);
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ciao");
                    try {
                        Thread.sleep(500);
                    } catch (Exception ignored) {
                    }
                }
            }
        };


        threadCaio.start();


    }
}



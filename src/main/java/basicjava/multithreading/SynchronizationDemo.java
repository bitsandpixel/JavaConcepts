package myjava.multithreading;

/**
 * We would implement synchronization keyword
 * When multiple threads are accessing a single method we can add synchronized keyword to method header
 * which would ensure at once only one thread is accessing the method thus we can avoid the incorrect results
 * especially when both the threads are working towards one common goal
 * <p>
 * we can make the method thread-safe by adding the synchronized keyword
 *
 * @author Vishnu Kandanelly
 */
public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread threadCount1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread threadCount2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread threadCount3 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        /*
         * We can achieve the same result by calling sleep method in between two thread executions of Thread class
         * */

//        try {
//            Thread.sleep(10);
//        } catch (Exception ignored) {
//        }

        threadCount1.start();
        threadCount2.start();
        threadCount3.start();

        threadCount1.join();
        threadCount2.join();
        threadCount3.join();

        System.out.println(counter.count);
    }
}

class Counter {
    int count;

    synchronized void increment() {
        count++;
    }
}

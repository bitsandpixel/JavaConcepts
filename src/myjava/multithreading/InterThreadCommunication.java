package myjava.multithreading;

/**
 * @author Vishnu Kandanelly
 */
public class InterThreadCommunication {

    public static void main(String[] args) {
        Number number = new Number();
        new Producer(number);
        new Consumer(number);

    }

}

class Number {
    int num;
    boolean valueSet = false;

    public synchronized void getNum() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        System.out.println("Get Number: "+num);
        valueSet=false;
        notify();
    }

    public synchronized void setNum(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        System.out.println("Set Number: "+num);
        this.num = num;
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {

    Number number;

    public Producer(Number number) {
        this.number = number;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            number.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Number number;

    public Consumer(Number number) {
        this.number = number;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            number.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





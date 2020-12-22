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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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





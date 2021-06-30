package multithreading;

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {

        PrintSumNumbers obj = new PrintSumNumbers();

        Thread t1 = new Thread(obj);
        t1.setName("T1");

        Thread t2 = new Thread(obj);
        t2.setName("T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalSum = obj.totalSum;
        System.out.println("******** Total Sum *******  => " + totalSum);

    }
}

class PrintSumNumbers implements Runnable {

    public int totalSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " Number is " + i);
            updateCounter();
        }
    }

    private synchronized void updateCounter() {
        totalSum = totalSum + 1;
    }
}


package multithreading;

class XYZU implements Runnable {


    @Override
    public synchronized void run() {

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " => " + i);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class InterProcess {
    public static void main(String[] args) throws InterruptedException {
        XYZU obj = new XYZU();
        Thread t1 = new Thread(obj);

        t1.start();
        Thread.sleep(1000);

        synchronized (obj) {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " => " + i);
                    obj.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
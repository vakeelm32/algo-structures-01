package multithreading;

public class ThreadTest6 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start - " + Thread.currentThread().getName());

        MyThread1 obj = new MyThread1();

        Thread t1 = new Thread(obj);
        t1.setName("TT11");

        t1.start();
        Thread.sleep(1000);

        obj.show();
        System.out.println("End of My App");


    }

}
class MyThread1 implements Runnable {

    Object lock1 = new Object();
    Object lock2 = new Object();

    @Override
    public void run() {
        System.out.println("Start=> " + Thread.currentThread().getName());

        synchronized (lock1) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is thread safe cide");
        }

        System.out.println("RUN ENDS");
    }

    public void show() {
        synchronized (lock2) {
            System.out.println("inside show");
        }
    }
}
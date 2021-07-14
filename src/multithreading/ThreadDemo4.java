package multithreading;

public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {

        PrintSumNumbers1 obj = new PrintSumNumbers1();

        Thread t1 = new Thread(obj);
        t1.setName("T1");

        t1.start();


        Thread.sleep(100);
        obj.show();
        obj.display();
        System.out.println("End");
    }
}

class PrintSumNumbers1 implements Runnable {

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RUN ENDS");
    }

    public synchronized void display() {
        System.out.println("Inside display");
    }

    public void show() {
        System.out.println("show method");
    }
}


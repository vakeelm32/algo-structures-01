package multithreading;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting the Program");
        //Thread.sleep(3000);

        Job1 job1 = new Job1();
        Thread t1 = new Thread(job1);
        t1.setName("T1111");

        Job2 job2 = new Job2();
        Thread t2 = new Thread(job2);
        t2.setName("T2222");

        t1.start(); //
        //Thread.sleep(5000);
        System.out.println("*****************");
        t1.join();

        t2.start();


    }
}

class Job1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Number is " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Job2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                //Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Number is " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

package multithreading;

public class ThreadTest {

    public static void main(String[] args) {


        System.out.println("Start - " + Thread.currentThread().getName());

        MyThread t = new MyThread();
        t.setName("TT");
        t.start();


        int i = 1;
        while (i < 100) {
            System.out.println("Main "+Thread.currentThread().getName() +"-" +i);
            i++;
        }
        System.out.println("End of My App");


    }

}

// 1
class MyThread extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("New - " + Thread.currentThread().getName() + " - " +i);
            i++;
        }
    }
}

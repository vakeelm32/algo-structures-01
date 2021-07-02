package multithreading;

public class ThreadDemo5 {
    public static void main(String[] args) throws InterruptedException {

        PrintSumNumbers2 obj = new PrintSumNumbers2();

        Thread t1 = new Thread(obj);
        t1.setName("T1");

        t1.start();


    }
}

class PrintSumNumbers2 implements Runnable {

    // 50 request
    @Override
    public  void run() {

        boolean istrue = false;

        if (istrue) {
            // 30 request from here
            /// 250 lines
        } else {
            // 20 request from here
            // update counter
            // 500 lins of code
            synchronized (this){

            }
        }

    }


}


package multithreading;

public class ThreadDemo3 {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        bar();
    }

    private static void bar() {
        zoo();
    }

    private static void zoo() {
    }
}


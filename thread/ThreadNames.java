// File name: ThreadNames.java
public class ThreadNames {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Scooby") {
            @Override
            public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        };
        
        Thread thread2 = new Thread("Shaggy") {
            @Override
            public void run() {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        };
        
        thread1.start();
        thread2.start();
    }
}
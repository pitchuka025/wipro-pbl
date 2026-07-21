class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " Completed");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("MAX Thread");
        PriorityThread t2 = new PriorityThread("MIN Thread");
        PriorityThread t3 = new PriorityThread("NORM Thread");

        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.MIN_PRIORITY);   // 1
        t3.setPriority(Thread.NORM_PRIORITY);  // 5

        t1.start();
        t2.start();
        t3.start();
    }
}
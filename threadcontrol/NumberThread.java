class PrintThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(5000); // 5 seconds delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class NumberThread {

    public static void main(String[] args) {

        PrintThread t = new PrintThread();
        t.start();
    }
}
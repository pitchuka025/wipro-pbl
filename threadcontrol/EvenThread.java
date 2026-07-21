class EvenNumbers extends Thread {

    public void run() {
        System.out.println("Even Numbers:");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

class OddNumbers extends Thread {

    public void run() {
        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

public class EvenThread {

    public static void main(String[] args) {

        EvenNumbers even = new EvenNumbers();
        OddNumbers odd = new OddNumbers();

        even.start();

        try {
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        odd.start();
    }
}
class RaceThread extends Thread {

    private static boolean raceFinished = false;

    public RaceThread(String name) {
        super(name);
    }

    public void run() {

        for (int distance = 1; distance <= 100 && !raceFinished; distance++) {

            System.out.println(getName() + " ran " + distance + " meters");

            // Hare sleeps after running 60 meters
            if (getName().equals("Hare") && distance == 60) {
                System.out.println("\nHare is sleeping for 1000 milliseconds...\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (distance == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n******************************");
                System.out.println(getName() + " WINS THE RACE!");
                System.out.println("******************************");
            }
        }

        if (raceFinished && !getName().equals("Hare")) {
            System.out.println(getName() + " stopped because the race is over.");
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Race Started...\n");

        hare.start();
        tortoise.start();
    }
}
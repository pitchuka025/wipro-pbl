import java.util.Scanner;

public class VideoLauncherSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("==========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1..6): ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Exiting.");
                break;
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video: ");
                    String name = sc.nextLine();
                    store.addVideo(name);
                    break;
                case 2:
                    System.out.print("Enter the name of the video to checkout: ");
                    name = sc.nextLine();
                    store.doCheckout(name);
                    break;
                case 3:
                    System.out.print("Enter the name of the video to return: ");
                    name = sc.nextLine();
                    store.doReturn(name);
                    break;
                case 4:
                    System.out.print("Enter the name of the video: ");
                    name = sc.nextLine();
                    System.out.print("Enter rating: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid rating. Skipping.");
                        sc.nextLine();
                        break;
                    }
                    int rating = sc.nextInt();
                    sc.nextLine();
                    store.receiveRating(name, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private Video[] store = new Video[100];
    private int count = 0;

    public void addVideo(String name) {
        if (count >= store.length) {
            System.out.println("Store is full. Cannot add more videos.");
            return;
        }
        store[count++] = new Video(name);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\"");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("---------------------------------------------");
        System.out.printf("%-20s %-20s %-10s\n",
                "Video Name", "Checkout Status", "Rating");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-20s %-10d\n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("---------------------------------------------");
    }
}

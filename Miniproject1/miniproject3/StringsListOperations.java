import java.util.ArrayList;
import java.util.Scanner;

public class StringsListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception ex) {
                System.out.println("Invalid choice");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    String item = sc.nextLine().trim();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;
                case 2:
                    System.out.println("Enter the item to search :");
                    String key = sc.nextLine().trim();
                    if (list.contains(key)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the item to delete :");
                    String del = sc.nextLine().trim();
                    if (list.remove(del)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("The Items in the list are :");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");

        System.out.println("Original TreeSet: " + treeSet);

        // a) Reverse the elements of the Collection
        TreeSet<String> reversedSet = new TreeSet<>();
        for (String item : treeSet) {
            reversedSet.add(item);
        }
        System.out.println("Reversed order (using descendingSet): " + reversedSet.descendingSet());

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists or not
        String searchElement = "Apple";
        if (treeSet.contains(searchElement)) {
            System.out.println(searchElement + " exists in the TreeSet.");
        } else {
            System.out.println(searchElement + " does not exist in the TreeSet.");
        }

        String missingElement = "Mango";
        if (treeSet.contains(missingElement)) {
            System.out.println(missingElement + " exists in the TreeSet.");
        } else {
            System.out.println(missingElement + " does not exist in the TreeSet.");
        }
    }
}

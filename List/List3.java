import java.util.ArrayList;
import java.util.Iterator;

public class List3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        printAll(names);
    }

    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

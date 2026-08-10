import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(-5);
        al.add(-8);
        al.add(7);
        al.add(12);
        al.add(-3);
        al.add(4);
        al.add(-2);

        List<Integer> result = al.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .toList();

        System.out.println("Filtered List: " + result);
    }
}

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiner1 {
	public static String joinNames(ArrayList<String> names) {
		StringJoiner sj = new StringJoiner(",", "{", "}");
		for (String name : names) sj.add(name);
		return sj.toString();
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		System.out.println(joinNames(names));
	}
}


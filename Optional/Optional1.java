import java.util.Optional;

public class Optional1 {
	public static void main(String[] args) {
		String[] names = new String[5];

		// Safe retrieval using Optional to avoid NullPointerException
		Optional<String> maybeName = Optional.ofNullable(names[0]);

		// Example 1: provide a default value when absent
		String value = maybeName.orElse("(no name)");
		System.out.println("Length (with default): " + value.length());

		// Example 2: act only if present
		maybeName.ifPresent(n -> System.out.println("Length (if present): " + n.length()));

		// Example 3: throw a custom exception if absent
		try {
			String nameOrThrow = maybeName.orElseThrow(() -> new IllegalStateException("Name not present"));
			System.out.println(nameOrThrow.length());
		} catch (IllegalStateException e) {
			System.out.println("Caught: " + e.getMessage());
		}
	}
}


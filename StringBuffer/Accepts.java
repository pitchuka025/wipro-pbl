
public class Accepts {
	public static String removeFirstLast(String s) {
		if (s == null) return "";
		if (s.length() <= 2) return "";
		return s.substring(1, s.length() - 1);
	}

	public static void main(String[] args) {
		String input;
		if (args.length > 0) {
			input = args[0];
		} else {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			input = sc.nextLine();
			sc.close();
		}

		System.out.println(removeFirstLast(input));
	}
}


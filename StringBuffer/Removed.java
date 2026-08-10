
public class Removed {
	public static String removeWithStar(String s) {
		if (s == null || s.isEmpty()) return "";
		int n = s.length();
		boolean[] remove = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '*') {
				remove[i] = true;
				if (i > 0) remove[i - 1] = true;
				if (i < n - 1) remove[i + 1] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (!remove[i]) sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String input;
		if (args.length > 0) {
			input = args[0];
		} else {
			System.out.println("Enter a string (with *):");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			input = sc.nextLine();
			sc.close();
		}

		System.out.println(removeWithStar(input));
	}
}


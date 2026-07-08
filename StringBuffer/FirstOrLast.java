public class FirstOrLast {
	public static String firstOrLast(String s) {
		if (s == null || s.isEmpty()) return s;
		int start = 0, end = s.length();
		if (s.charAt(0) == 'x') start = 1;
		if (end > start && s.charAt(end - 1) == 'x') end = end - 1;
		return s.substring(start, end);
	}

	public static void main(String[] args) {
		String input;
		if (args.length > 0) {
			input = args[0];
		} else {
			System.out.println("Enter a string:");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			input = sc.nextLine();
			sc.close();
		}

		System.out.println(firstOrLast(input));
	}
}


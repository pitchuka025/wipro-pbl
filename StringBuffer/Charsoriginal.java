public class Charsoriginal {
	public static String copies(String str) {
		if (str == null) return "";
		int n = str.length();
		String firstTwo = str.length() >= 2 ? str.substring(0, 2) : str;
		StringBuilder sb = new StringBuilder(n * firstTwo.length());
		for (int i = 0; i < n; i++) sb.append(firstTwo);
		return sb.toString();
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

		System.out.println(copies(input));
	}
}


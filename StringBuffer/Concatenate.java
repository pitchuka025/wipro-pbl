public class Concatenate {
	public static String concat(String a, String b) {
		if (a == null) a = "";
		if (b == null) b = "";

		String s1 = a.trim();
		String s2 = b.trim();

		if (s1.isEmpty()) return s2.toLowerCase();
		if (s2.isEmpty()) return s1.toLowerCase();

		char last = Character.toLowerCase(s1.charAt(s1.length() - 1));
		char first = Character.toLowerCase(s2.charAt(0));

		String result;
		if (last == first) {
			result = s1 + s2.substring(1);
		} else {
			result = s1 + " " + s2;
		}

		return result.toLowerCase();
	}

	public static void main(String[] args) {
		String a, b;
		if (args.length >= 2) {
			a = args[0];
			b = args[1];
		} else {
			System.out.println("Enter two strings separated by a comma (e.g. Mark,kate):");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String line = sc.nextLine();
			sc.close();
			String[] parts = line.split(",", 2);
			if (parts.length == 2) {
				a = parts[0];
				b = parts[1];
			} else {
				System.out.println("Invalid input. Provide two strings separated by a comma.");
				return;
			}
		}

		System.out.println(concat(a, b));
	}
}

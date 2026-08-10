public class Short {
	public static String shortLongShort(String a, String b) {
		if (a == null) a = "";
		if (b == null) b = "";

		String shortS = a.length() <= b.length() ? a : b;
		String longS = a.length() > b.length() ? a : b;

		return shortS + longS + shortS;
	}

	public static void main(String[] args) {
		String a, b;
		if (args.length >= 2) {
			a = args[0];
			b = args[1];
		} else {
			System.out.println("Enter two strings separated by a space (e.g. hi hello):");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			a = sc.next();
			b = sc.next();
			sc.close();
		}

		System.out.println(shortLongShort(a, b));
	}
}


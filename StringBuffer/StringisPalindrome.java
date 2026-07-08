(optional)>
public class StringisPalindrome {
	public static boolean isPalindrome(String s) {
		if (s == null) return false;
		String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String rev = new StringBuilder(cleaned).reverse().toString();
		return cleaned.equals(rev);
	}

	public static void main(String[] args) {
		String input;
		if (args.length > 0) {
			input = String.join(" ", args);
		} else {
			System.out.println("Enter a string to check:");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			input = sc.nextLine();
			sc.close();
		}

		boolean pal = isPalindrome(input);
		System.out.println('"' + input + '"' + (pal ? " is a palindrome" : " is not a palindrome"));
	}
}


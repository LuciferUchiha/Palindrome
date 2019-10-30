package application;

public class Palindrom {

	public static boolean isPalindrome(char[] letters) {
		letters = makeAllToLowerCase(letters);
		boolean isPalindrom = true;
		for (int i = 0; i != letters.length / 2; i++) {
			if (letters[i] != letters[(letters.length - 1) - i])
				isPalindrom = false;
		}
		return isPalindrom;
	}

	public static boolean isPalindromeRecursive(char[] letters) {
		makeAllToLowerCase(letters);
		return recursion(letters, 0, letters.length - 1);
	}

	private static boolean recursion(char[] letters, int start, int end) {
		if (start == end)
			return true;
		if (letters[start] != letters[end])
			return false;
		if (start < end + 1)
			return recursion(letters, start + 1, end - 1);
		return true;
	}

	private static char[] makeAllToLowerCase(char[] letters) {
		for (int i = 0; i != letters.length; i++)
			letters[i] = Character.toLowerCase(letters[i]);
		return letters;
	}
}

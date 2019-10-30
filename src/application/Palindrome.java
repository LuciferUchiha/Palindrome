package application;

public class Palindrome {

	public static boolean isPalindrome(char[] letters) {
		if (letters.length < 1)
			return false;
		letters = makeAllToLowerCase(letters);
		boolean isPalindrom = true;
		for (int i = 0; i != letters.length / 2; i++) {
			if (letters[i] != letters[(letters.length - 1) - i])
				isPalindrom = false;
		}
		return isPalindrom;
	}

	public static boolean isPalindrome(String word) {
		return isPalindrome(word.toCharArray());
	}

	public static boolean isPalindromeRecursive(char[] letters) {
		if (letters.length < 1)
			return false;
		makeAllToLowerCase(letters);
		return recursion(letters, 0, letters.length - 1);
	}

	public static boolean isPalindromeRecursive(String word) {
		return isPalindromeRecursive(word.toCharArray());
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

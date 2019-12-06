package application;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static boolean isCharArrayPalindrome(char[] letters) {
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

	public static boolean isWordPalindrome(String word) {
		return isCharArrayPalindrome(word.toCharArray());
	}

	public static boolean isSentencePalindrome(String sentence) {
		sentence = sentence.replaceAll("[^a-zA-Z]", "");
		return isWordPalindrome(sentence);
	}

	public static boolean isNumberPalindrome(int number) {
		return isWordPalindrome(String.valueOf(number));
	}

	public static List<Integer> getAllPalindromesInRange(int start, int end) {
		List<Integer> results = new ArrayList<Integer>();
		for (int number = start; number != end; number++) {
			if (isNumberPalindrome(number))
				results.add(number);
		}
		return results;
	}

	/* Recursive */

	public static boolean isCharArrayPalindromeRecursive(char[] letters) {
		if (letters.length < 1)
			return false;
		makeAllToLowerCase(letters);
		return recursion(letters, 0, letters.length - 1);
	}

	public static boolean isWordPalindromeRecursive(String word) {
		return isCharArrayPalindromeRecursive(word.toCharArray());
	}

	public static boolean isSentencePalindromeRecursive(String sentence) {
		sentence = sentence.replaceAll("[^a-zA-Z]", "");
		return isWordPalindromeRecursive(sentence);
	}

	public static boolean isNumberPalindromeRecursive(int number) {
		return isWordPalindrome(String.valueOf(number));
	}

	public static List<Integer> getAllPalindromesInRangeRecursive(int start, int end) {
		List<Integer> results = new ArrayList<Integer>();
		for (int number = start; number != end; number++) {
			if (isNumberPalindromeRecursive(number))
				results.add(number);
		}
		return results;
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

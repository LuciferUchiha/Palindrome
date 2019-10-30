package application.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import application.Palindrom;

public class PalindromTest {

	@Test
	public void checkABBAIsPalindrom() {
		String word = "ABBA";
		assertEquals(true, Palindrom.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindrome(word));
		assertEquals(true, Palindrom.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindromeRecursive(word));
	}

	@Test
	public void checkbobIsPalindrom() {
		String word = "bob";
		assertEquals(true, Palindrom.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindrome(word));
		assertEquals(true, Palindrom.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindromeRecursive(word));
	}

	@Test
	public void checkLagerregalIsPalindrom() {
		String word = "Lagerregal";
		assertEquals(true, Palindrom.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindrome(word));
		assertEquals(true, Palindrom.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrom.isPalindromeRecursive(word));
	}

	@Test
	public void checkPatrickIsNotPalindrom() {
		String word = "Patrick";
		assertEquals(false, Palindrom.isPalindrome(word.toCharArray()));
		assertEquals(false, Palindrom.isPalindrome(word));
		assertEquals(false, Palindrom.isPalindromeRecursive(word.toCharArray()));
		assertEquals(false, Palindrom.isPalindromeRecursive(word));
	}

}

package application.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import application.Palindrome;

public class PalindromeTest {
	
	@Test
	public void checkAIsPalindrom() {
		String word = "A";
		assertEquals(true, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindrome(word));
		assertEquals(true, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindromeRecursive(word));
	}
	
	@Test
	public void checkEmptyIsPalindrom() {
		String word = "";
		assertEquals(false, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(false, Palindrome.isPalindrome(word));
		assertEquals(false, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(false, Palindrome.isPalindromeRecursive(word));
	}

	@Test
	public void checkABBAIsPalindrom() {
		String word = "ABBA";
		assertEquals(true, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindrome(word));
		assertEquals(true, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindromeRecursive(word));
	}

	@Test
	public void checkbobIsPalindrom() {
		String word = "bob";
		assertEquals(true, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindrome(word));
		assertEquals(true, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindromeRecursive(word));
	}

	@Test
	public void checkLagerregalIsPalindrom() {
		String word = "Lagerregal";
		assertEquals(true, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindrome(word));
		assertEquals(true, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isPalindromeRecursive(word));
	}

	@Test
	public void checkPatrickIsNotPalindrom() {
		String word = "Patrick";
		assertEquals(false, Palindrome.isPalindrome(word.toCharArray()));
		assertEquals(false, Palindrome.isPalindrome(word));
		assertEquals(false, Palindrome.isPalindromeRecursive(word.toCharArray()));
		assertEquals(false, Palindrome.isPalindromeRecursive(word));
	}

}

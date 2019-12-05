package application.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import application.Palindrome;

public class PalindromeTest {
	
	@Test
	public void checkAIsPalindrome() {
		String word = "A";
		assertEquals(true, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindrome(word));
		assertEquals(true, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindromeRecursive(word));
	}
	
	@Test
	public void checkEmptyIsNotPalindrome() {
		String word = "";
		assertEquals(false, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(false, Palindrome.isWordPalindrome(word));
		assertEquals(false, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(false, Palindrome.isWordPalindromeRecursive(word));
	}

	@Test
	public void checkABBAIsPalindrome() {
		String word = "ABBA";
		assertEquals(true, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindrome(word));
		assertEquals(true, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindromeRecursive(word));
	}

	@Test
	public void checkbobIsPalindrome() {
		String word = "bob";
		assertEquals(true, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindrome(word));
		assertEquals(true, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindromeRecursive(word));
	}

	@Test
	public void checkLagerregalIsPalindrome() {
		String word = "Lagerregal";
		assertEquals(true, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindrome(word));
		assertEquals(true, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(true, Palindrome.isWordPalindromeRecursive(word));
	}
	
	@Test
	public void checkPatrickIsNotPalindrome() {
		String word = "Patrick";
		assertEquals(false, Palindrome.isCharArrayPalindrome(word.toCharArray()));
		assertEquals(false, Palindrome.isWordPalindrome(word));
		assertEquals(false, Palindrome.isCharArrayPalindromeRecursive(word.toCharArray()));
		assertEquals(false, Palindrome.isWordPalindromeRecursive(word));
	}
	
	@Test
	public void checkSentencesArePalindromes() {
		String mrOwlSentence = "Mr. Owl ate my metal worm";
		assertEquals(true, Palindrome.isSentencePalindrome(mrOwlSentence));
		assertEquals(true, Palindrome.isSentencePalindromeRecursive(mrOwlSentence));
		// Sentence with Punctuation, capitalization, and spaces
		String salamiSentence = "Go hang a salami, I'm a lasagna hog!";
		assertEquals(true, Palindrome.isSentencePalindrome(salamiSentence));
		assertEquals(true, Palindrome.isSentencePalindromeRecursive(salamiSentence));
	}
	
	@Test
	public void checkEmptySentenceIsNotPalindrome() {
		String emptySentence = "";
		assertEquals(false, Palindrome.isSentencePalindrome(emptySentence));
		assertEquals(false, Palindrome.isSentencePalindromeRecursive(emptySentence));
	}
	
	@Test
	public void checkIncorrectSentencesAreNotPalindromes() {
		String mrOwlSentence = "Mrs. Owl ate my metal worm";
		assertEquals(false, Palindrome.isSentencePalindrome(mrOwlSentence));
		assertEquals(false, Palindrome.isSentencePalindromeRecursive(mrOwlSentence));
		// Sentence with Punctuation, capitalization, and spaces
		String salamiSentence = "Go hang a lot of salami, I'm a lasagna hog!";
		assertEquals(false, Palindrome.isSentencePalindrome(salamiSentence));
		assertEquals(false, Palindrome.isSentencePalindromeRecursive(salamiSentence));
	}
	
	public void checkNumbersArePalindromes(){
		int evenLengthNumber = 11;
		assertEquals(true, Palindrome.isNumberPalindrome(evenLengthNumber));
		assertEquals(true, Palindrome.isNumberPalindromeRecursive(evenLengthNumber));
		int unevenLengthNumber = 121;
		assertEquals(true, Palindrome.isNumberPalindrome(unevenLengthNumber));
		assertEquals(true, Palindrome.isNumberPalindromeRecursive(unevenLengthNumber));
	}
	
	public void checkIncorrectNumbersAreNotPalindromes(){
		int evenLengthNumber = 12;
		assertEquals(false, Palindrome.isNumberPalindrome(evenLengthNumber));
		assertEquals(false, Palindrome.isNumberPalindromeRecursive(evenLengthNumber));
		int unevenLengthNumber = 123;
		assertEquals(false, Palindrome.isNumberPalindrome(unevenLengthNumber));
		assertEquals(false, Palindrome.isNumberPalindromeRecursive(unevenLengthNumber));
	}
}

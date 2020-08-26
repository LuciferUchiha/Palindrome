package com.gr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucifer Uchiha
 * @version 1.0
 */
public class Palindrome {

    /* Iterative */

    /**
     * Returns a boolean of whether the char array is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param chars char array containing the characters to be checked.
     * @return boolean of whether the char array is a palindrome or not.
     */
    public static boolean isCharArrayPalindromeIterative(char[] chars) {
        if (chars.length < 1)
            return false;
        char[] formattedChars = convertAllCharsToUpperCase(chars);
        boolean isPalindrome = true;
        for (int i = 0; i != formattedChars.length / 2; i++)
            if (formattedChars[i] != formattedChars[(formattedChars.length - 1) - i]) {
                isPalindrome = false;
                break;
            }
        return isPalindrome;
    }

    /**
     * Returns a boolean of whether the word of type String is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param word the word to be checked.
     * @return boolean of whether the word is a palindrome or not.
     */
    public static boolean isWordPalindromeIterative(String word) {
        return isCharArrayPalindromeIterative(word.toCharArray());
    }

    /**
     * Returns a boolean of whether the sentence of type String is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param sentence the sentence to be checked.
     * @return boolean of whether the sentence is a palindrome or not.
     */
    public static boolean isSentencePalindromeIterative(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        return isWordPalindromeIterative(newSentence);
    }

    /**
     * Returns a boolean of whether the number of type byte (-128 to 127) is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeIterative(byte number) {
        return isWordPalindromeIterative(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type short (32,768 to 32,767) is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeIterative(short number) {
        return isWordPalindromeIterative(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type int (-2,147,483,648 to 2,147,483,647) is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeIterative(int number) {
        return isWordPalindromeIterative(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) is a palindrome or not.
     * This is determined by using the iterative algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeIterative(long number) {
        return isWordPalindromeIterative(String.valueOf(number));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type long to end of type long.
     * This is determined by using the iterative algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Long> getAllNumberPalindromesInRangeIterative(long start, long end) {
        List<Long> results = new ArrayList<>();
        for (long number = start; number != end; number++)
            if (isNumberPalindromeIterative(number))
                results.add(number);
        return results;
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type int to end of type int.
     * This is determined by using the iterative algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Integer> getAllNumberPalindromesInRangeIterative(int start, int end) {
        return convertLongListToIntegerList(getAllNumberPalindromesInRangeIterative((long) start, (long) end));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type short to end of type short.
     * This is determined by using the iterative algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Short> getAllNumberPalindromesInRangeIterative(short start, short end) {
        return convertLongListToShortList(getAllNumberPalindromesInRangeIterative((long) start, (long) end));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type byte to end of type byte.
     * This is determined by using the iterative algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Byte> getAllNumberPalindromesInRangeIterative(byte start, byte end) {
        return convertLongListToByteList(getAllNumberPalindromesInRangeIterative((long) start, (long) end));
    }

    /* Recursive */

    /**
     * Returns a boolean of whether the char array is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param chars char array containing the characters to be checked.
     * @return boolean of whether the char array is a palindrome or not.
     */
    public static boolean isCharArrayPalindromeRecursive(char[] chars) {
        if (chars.length < 1)
            return false;
        char[] formattedChars = convertAllCharsToUpperCase(chars);
        return recursion(formattedChars, 0, formattedChars.length - 1);
    }

    /**
     * The recursive algorithm.
     *
     * @param chars char array containing the characters to be checked.
     * @param start the left char being compared.
     * @param end   the right char being compared.
     * @return boolean of whether the char array is a palindrome or not.
     */
    private static boolean recursion(char[] chars, int start, int end) {
        if (start == end)
            return true;
        if (chars[start] != chars[end])
            return false;
        if (start < end + 1)
            return recursion(chars, ++start, --end);
        return true;
    }

    /**
     * Returns a boolean of whether the word of type String is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param word the word to be checked.
     * @return boolean of whether the word is a palindrome or not.
     */
    public static boolean isWordPalindromeRecursive(String word) {
        return isCharArrayPalindromeRecursive(word.toCharArray());
    }

    /**
     * Returns a boolean of whether the sentence of type String is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param sentence the sentence to be checked.
     * @return boolean of whether the sentence is a palindrome or not.
     */
    public static boolean isSentencePalindromeRecursive(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        return isWordPalindromeRecursive(newSentence);
    }

    /**
     * Returns a boolean of whether the number of type byte (-128 to 127) is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeRecursive(byte number) {
        return isWordPalindromeRecursive(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type short (32,768 to 32,767) is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeRecursive(short number) {
        return isWordPalindromeRecursive(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type int (-2,147,483,648 to 2,147,483,647) is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeRecursive(int number) {
        return isWordPalindromeRecursive(String.valueOf(number));
    }

    /**
     * Returns a boolean of whether the number of type long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) is a palindrome or not.
     * This is determined by using the recursive algorithm.
     *
     * @param number the number to be checked.
     * @return boolean of whether the number is a palindrome or not.
     */
    public static boolean isNumberPalindromeRecursive(long number) {
        return isWordPalindromeRecursive(String.valueOf(number));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type long to end of type long.
     * This is determined by using the recursive algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Long> getAllNumberPalindromesInRangeRecursive(long start, long end) {
        List<Long> results = new ArrayList<>();
        for (long number = start; number != end; number++)
            if (isNumberPalindromeRecursive(number))
                results.add(number);
        return results;
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type int to end of type int.
     * This is determined by using the recursive algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Integer> getAllNumberPalindromesInRangeRecursive(int start, int end) {
        return convertLongListToIntegerList(getAllNumberPalindromesInRangeRecursive((long) start, (long) end));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type short to end of type short.
     * This is determined by using the recursive algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Short> getAllNumberPalindromesInRangeRecursive(short start, short end) {
        return convertLongListToShortList(getAllNumberPalindromesInRangeRecursive((long) start, (long) end));
    }

    /**
     * Returns a List containing all the numbers that are palindromes in the range that is given from
     * start of type byte to end of type byte.
     * This is determined by using the recursive algorithm.
     *
     * @param start the start of the range, inclusive.
     * @param end   the end of the range, exclusive.
     * @return List containing all the numbers that are palindromes in the given range.
     */
    public static List<Byte> getAllNumberPalindromesInRangeRecursive(byte start, byte end) {
        return convertLongListToByteList(getAllNumberPalindromesInRangeRecursive((long) start, (long) end));
    }

    /**
     * Converts all letters in the given char array to capital letters if they aren't already.
     *
     * @param chars the start of the range, inclusive.
     * @return char array with the capitalized letters.
     */
    private static char[] convertAllCharsToUpperCase(char[] chars) {
        char[] formattedChars = new char[chars.length];
        for (int i = 0; i != chars.length; i++)
            if (Character.isLetter(chars[i]) && Character.isLowerCase(chars[i]))
                formattedChars[i] = Character.toUpperCase(chars[i]);
            else
                formattedChars[i] = chars[i];
        return formattedChars;
    }

    /**
     * Converts a List containing Long values to a List of Bytes.
     *
     * @param listOfLongs the List containing the Long values
     * @return the List containing the Byte values
     */
    private static List<Byte> convertLongListToByteList(List<Long> listOfLongs) {
        List<Byte> result = new ArrayList<>();
        for (Long i : listOfLongs)
            result.add(i.byteValue());
        return result;
    }

    /**
     * Converts a List containing Long values to a List of Shorts.
     *
     * @param listOfLongs the List containing the Long values
     * @return the List containing the Shorts values
     */
    private static List<Short> convertLongListToShortList(List<Long> listOfLongs) {
        List<Short> result = new ArrayList<>();
        for (Long i : listOfLongs)
            result.add(i.shortValue());
        return result;
    }

    /**
     * Converts a List containing Long values to a List of Integers.
     *
     * @param listOfLongs the List containing the Long values
     * @return the List containing the Integers values
     */
    private static List<Integer> convertLongListToIntegerList(List<Long> listOfLongs) {
        List<Integer> result = new ArrayList<>();
        for (Long i : listOfLongs)
            result.add(i.intValue());
        return result;
    }
}

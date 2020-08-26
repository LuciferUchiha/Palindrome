package com.gr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Palindrome Class")
public class PalindromeTest {

    // Nested Iterative
    @Nested
    class Iterative {

        @Nested
        class Word {

            @Test
            void testEmptyString() {
                assertFalse(Palindrome.isWordPalindromeIterative(""));
            }

            @Test
            void testSingleLetter() {
                assertTrue(Palindrome.isWordPalindromeIterative("A"));
                assertTrue(Palindrome.isWordPalindromeIterative("a"));
            }

            @Test
            void testName() {
                assertTrue(Palindrome.isWordPalindromeIterative("ABBA"));
                assertTrue(Palindrome.isWordPalindromeIterative("Ava"));
                assertTrue(Palindrome.isWordPalindromeIterative("bob"));
                assertFalse(Palindrome.isWordPalindromeIterative("FAIL"));
                assertFalse(Palindrome.isWordPalindromeIterative("Fail"));
                assertFalse(Palindrome.isWordPalindromeIterative("fail"));
            }

            @Test
            void testWord() {
                assertTrue(Palindrome.isWordPalindromeIterative("madam"));
                assertTrue(Palindrome.isWordPalindromeIterative("Racecar"));
                assertTrue(Palindrome.isWordPalindromeIterative("RADAR"));
                assertFalse(Palindrome.isWordPalindromeIterative("FAIL"));
                assertFalse(Palindrome.isWordPalindromeIterative("Fail"));
                assertFalse(Palindrome.isWordPalindromeIterative("fail"));
            }
        }

        @Nested
        class Sentence {
            @Test
            void testEmptyString() {
                assertFalse(Palindrome.isSentencePalindromeIterative(""));
            }

            @Test
            void testSingleLetter() {
                assertTrue(Palindrome.isSentencePalindromeIterative("A"));
                assertTrue(Palindrome.isSentencePalindromeIterative("a"));
            }

            @Test
            void testSingleWord() {
                assertTrue(Palindrome.isSentencePalindromeIterative("madam"));
                assertTrue(Palindrome.isSentencePalindromeIterative("Racecar"));
                assertTrue(Palindrome.isSentencePalindromeIterative("RADAR"));
                assertFalse(Palindrome.isSentencePalindromeIterative("FAIL"));
                assertFalse(Palindrome.isSentencePalindromeIterative("Fail"));
                assertFalse(Palindrome.isSentencePalindromeIterative("fail"));
            }

            @Test
            void testSentence() {
                assertTrue(Palindrome.isSentencePalindromeIterative("Murder for a jar of red rum"));
                assertTrue(Palindrome.isSentencePalindromeIterative("Rats live on no evil star"));
                assertTrue(Palindrome.isSentencePalindromeIterative("step on no pets"));
                assertFalse(Palindrome.isSentencePalindromeIterative("This should fail"));
                assertFalse(Palindrome.isSentencePalindromeIterative("this should fail"));
            }

            @Test
            void testSentenceWithPunctuation() {
                assertTrue(Palindrome.isSentencePalindromeIterative("Do geese see God?"));
                assertTrue(Palindrome.isSentencePalindromeIterative("Live on time, emit no evil"));
                assertTrue(Palindrome.isSentencePalindromeIterative("live on time, emit no evil"));
                assertFalse(Palindrome.isSentencePalindromeIterative("Will this fail?"));
                assertFalse(Palindrome.isSentencePalindromeIterative("will this fail?"));
            }
        }

        @Nested
        class Number {

            @Test
            void testSingleLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(0L));
                assertTrue(Palindrome.isNumberPalindromeIterative(1L));
                assertTrue(Palindrome.isNumberPalindromeIterative(3L));
            }

            @Test
            void testBiggerLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(123454321L));
                assertTrue(Palindrome.isNumberPalindromeIterative(1234567890987654321L));
                assertFalse(Palindrome.isNumberPalindromeIterative(123456789L));
                assertFalse(Palindrome.isNumberPalindromeIterative(1234567890123456789L));
            }

            @Test
            void testNegativeLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(-0L));
                assertFalse(Palindrome.isNumberPalindromeIterative(-123454321L));
                assertFalse(Palindrome.isNumberPalindromeIterative(-1234567890987654321L));
                assertFalse(Palindrome.isNumberPalindromeIterative(-123456789L));
                assertFalse(Palindrome.isNumberPalindromeIterative(-1234567890123456789L));
            }

            @Test
            void testSingleIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(0));
                assertTrue(Palindrome.isNumberPalindromeIterative(1));
                assertTrue(Palindrome.isNumberPalindromeIterative(3));
            }

            @Test
            void testBiggerIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(123454321));
                assertFalse(Palindrome.isNumberPalindromeIterative(123456789));
            }

            @Test
            void testNegativeIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative(-0));
                assertFalse(Palindrome.isNumberPalindromeIterative(-123454321));
                assertFalse(Palindrome.isNumberPalindromeIterative(-123456789));
            }

            @Test
            void testSingleShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((short) 0));
                assertTrue(Palindrome.isNumberPalindromeIterative((short) 1));
                assertTrue(Palindrome.isNumberPalindromeIterative((short) 3));
            }

            @Test
            void testBiggerShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((short) 12321));
                assertFalse(Palindrome.isNumberPalindromeIterative((short) 12345));
            }

            @Test
            void testNegativeShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((short) -0));
                assertFalse(Palindrome.isNumberPalindromeIterative((short) -12321));
                assertFalse(Palindrome.isNumberPalindromeIterative((short) -12345));
            }

            @Test
            void testSingleByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((byte) 0));
                assertTrue(Palindrome.isNumberPalindromeIterative((byte) 1));
                assertTrue(Palindrome.isNumberPalindromeIterative((byte) 3));
            }

            @Test
            void testBiggerByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((byte) 121));
                assertFalse(Palindrome.isNumberPalindromeIterative((byte) 123));
            }

            @Test
            void testNegativeByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeIterative((byte) -0));
                assertFalse(Palindrome.isNumberPalindromeIterative((byte) -121));
                assertFalse(Palindrome.isNumberPalindromeIterative((byte) -123));
            }

        }

        @Nested
        class NumberInRange {
            @Test
            void testEmptyRangeLong() {
                List<Long> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(122L, 130L));
            }

            @Test
            void testRangeSingleLong() {
                List<Long> expected = new ArrayList<>() {
                    {
                        add(1L);
                        add(2L);
                        add(3L);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(1L, 4L));
            }

            @Test
            void testRangeLong() {
                List<Long> expected = new ArrayList<>() {
                    {
                        add(121L);
                        add(131L);
                        add(141L);
                        add(151L);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(120L, 155L));
            }

            @Test
            void testNegativeRangeLong() {
                List<Long> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(-131L, 0L));
            }

            @Test
            void testEmptyRangeInteger() {
                List<Integer> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(122, 130));
            }

            @Test
            void testRangeSingleInteger() {
                List<Integer> expected = new ArrayList<>() {
                    {
                        add(1);
                        add(2);
                        add(3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(1, 4));
            }

            @Test
            void testRangeInteger() {
                List<Integer> expected = new ArrayList<>() {
                    {
                        add(121);
                        add(131);
                        add(141);
                        add(151);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(120, 155));
            }

            @Test
            void testNegativeRangeInteger() {
                List<Integer> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative(-131, 0));
            }

            @Test
            void testEmptyRangeShort() {
                List<Short> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((short) 122, (short) 130));
            }

            @Test
            void testRangeSingleShort() {
                List<Short> expected = new ArrayList<>() {
                    {
                        add((short) 1);
                        add((short) 2);
                        add((short) 3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((short) 1, (short) 4));
            }

            @Test
            void testRangeShort() {
                List<Short> expected = new ArrayList<>() {
                    {
                        add((short) 121);
                        add((short) 131);
                        add((short) 141);
                        add((short) 151);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((short) 120, (short) 155));
            }

            @Test
            void testNegativeRangeShort() {
                List<Short> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((short) -131, (short) 0));
            }

            @Test
            void testEmptyRangeByte() {
                List<Byte> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((byte) 122, (byte) 125));
            }

            @Test
            void testRangeSingleByte() {
                List<Byte> expected = new ArrayList<>() {
                    {
                        add((byte) 1);
                        add((byte) 2);
                        add((byte) 3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((byte) 1, (byte) 4));
            }

            @Test
            void testRangeByte() {
                List<Byte> expected = new ArrayList<>() {
                    {
                        add((byte) 101);
                        add((byte) 111);
                        add((byte) 121);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((byte) 100, (byte) 125));
            }

            @Test
            void testNegativeRangeByte() {
                List<Byte> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeIterative((byte) -125, (byte) 0));
            }
        }
    }

    @Nested
    class Recursive {
        @Nested
        class Word {

            @Test
            void testEmptyString() {
                assertFalse(Palindrome.isWordPalindromeRecursive(""));
            }

            @Test
            void testSingleLetter() {
                assertTrue(Palindrome.isWordPalindromeRecursive("A"));
                assertTrue(Palindrome.isWordPalindromeRecursive("a"));
            }

            @Test
            void testName() {
                assertTrue(Palindrome.isWordPalindromeRecursive("ABBA"));
                assertTrue(Palindrome.isWordPalindromeRecursive("Ava"));
                assertTrue(Palindrome.isWordPalindromeRecursive("bob"));
                assertFalse(Palindrome.isWordPalindromeRecursive("FAIL"));
                assertFalse(Palindrome.isWordPalindromeRecursive("Fail"));
                assertFalse(Palindrome.isWordPalindromeRecursive("fail"));
            }

            @Test
            void testWord() {
                assertTrue(Palindrome.isWordPalindromeRecursive("madam"));
                assertTrue(Palindrome.isWordPalindromeRecursive("Racecar"));
                assertTrue(Palindrome.isWordPalindromeRecursive("RADAR"));
                assertFalse(Palindrome.isWordPalindromeRecursive("FAIL"));
                assertFalse(Palindrome.isWordPalindromeRecursive("Fail"));
                assertFalse(Palindrome.isWordPalindromeRecursive("fail"));
            }
        }

        @Nested
        class Sentence {
            @Test
            void testEmptyString() {
                assertFalse(Palindrome.isSentencePalindromeRecursive(""));
            }

            @Test
            void testSingleLetter() {
                assertTrue(Palindrome.isSentencePalindromeRecursive("A"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("a"));
            }

            @Test
            void testSingleWord() {
                assertTrue(Palindrome.isSentencePalindromeRecursive("madam"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("Racecar"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("RADAR"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("FAIL"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("Fail"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("fail"));
            }

            @Test
            void testSentence() {
                assertTrue(Palindrome.isSentencePalindromeRecursive("Murder for a jar of red rum"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("Rats live on no evil star"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("step on no pets"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("This should fail"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("this should fail"));
            }

            @Test
            void testSentenceWithPunctuation() {
                assertTrue(Palindrome.isSentencePalindromeRecursive("Do geese see God?"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("Live on time, emit no evil"));
                assertTrue(Palindrome.isSentencePalindromeRecursive("live on time, emit no evil"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("Will this fail?"));
                assertFalse(Palindrome.isSentencePalindromeRecursive("will this fail?"));
            }
        }

        @Nested
        class Number {

            @Test
            void testSingleLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(0L));
                assertTrue(Palindrome.isNumberPalindromeRecursive(1L));
                assertTrue(Palindrome.isNumberPalindromeRecursive(3L));
            }

            @Test
            void testBiggerLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(123454321L));
                assertTrue(Palindrome.isNumberPalindromeRecursive(1234567890987654321L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(123456789L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(1234567890123456789L));
            }

            @Test
            void testNegativeLongNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(-0L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-123454321L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-1234567890987654321L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-123456789L));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-1234567890123456789L));
            }

            @Test
            void testSingleIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(0));
                assertTrue(Palindrome.isNumberPalindromeRecursive(1));
                assertTrue(Palindrome.isNumberPalindromeRecursive(3));
            }

            @Test
            void testBiggerIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(123454321));
                assertFalse(Palindrome.isNumberPalindromeRecursive(123456789));
            }

            @Test
            void testNegativeIntegerNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive(-0));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-123454321));
                assertFalse(Palindrome.isNumberPalindromeRecursive(-123456789));
            }

            @Test
            void testSingleShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((short) 0));
                assertTrue(Palindrome.isNumberPalindromeRecursive((short) 1));
                assertTrue(Palindrome.isNumberPalindromeRecursive((short) 3));
            }

            @Test
            void testBiggerShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((short) 12321));
                assertFalse(Palindrome.isNumberPalindromeRecursive((short) 12345));
            }

            @Test
            void testNegativeShortNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((short) -0));
                assertFalse(Palindrome.isNumberPalindromeRecursive((short) -12321));
                assertFalse(Palindrome.isNumberPalindromeRecursive((short) -12345));
            }

            @Test
            void testSingleByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((byte) 0));
                assertTrue(Palindrome.isNumberPalindromeRecursive((byte) 1));
                assertTrue(Palindrome.isNumberPalindromeRecursive((byte) 3));
            }

            @Test
            void testBiggerByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((byte) 121));
                assertFalse(Palindrome.isNumberPalindromeRecursive((byte) 123));
            }

            @Test
            void testNegativeByteNumber() {
                assertTrue(Palindrome.isNumberPalindromeRecursive((byte) -0));
                assertFalse(Palindrome.isNumberPalindromeRecursive((byte) -121));
                assertFalse(Palindrome.isNumberPalindromeRecursive((byte) -123));
            }

        }

        @Nested
        class NumberInRange {
            @Test
            void testEmptyRangeLong() {
                List<Long> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(122L, 130L));
            }

            @Test
            void testRangeSingleLong() {
                List<Long> expected = new ArrayList<>() {
                    {
                        add(1L);
                        add(2L);
                        add(3L);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(1L, 4L));
            }

            @Test
            void testRangeLong() {
                List<Long> expected = new ArrayList<>() {
                    {
                        add(121L);
                        add(131L);
                        add(141L);
                        add(151L);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(120L, 155L));
            }

            @Test
            void testNegativeRangeLong() {
                List<Long> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(-131L, 0L));
            }

            @Test
            void testEmptyRangeInteger() {
                List<Integer> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(122, 130));
            }

            @Test
            void testRangeSingleInteger() {
                List<Integer> expected = new ArrayList<>() {
                    {
                        add(1);
                        add(2);
                        add(3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(1, 4));
            }

            @Test
            void testRangeInteger() {
                List<Integer> expected = new ArrayList<>() {
                    {
                        add(121);
                        add(131);
                        add(141);
                        add(151);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(120, 155));
            }

            @Test
            void testNegativeRangeInteger() {
                List<Integer> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive(-131, 0));
            }

            @Test
            void testEmptyRangeShort() {
                List<Short> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((short) 122, (short) 130));
            }

            @Test
            void testRangeSingleShort() {
                List<Short> expected = new ArrayList<>() {
                    {
                        add((short) 1);
                        add((short) 2);
                        add((short) 3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((short) 1, (short) 4));
            }

            @Test
            void testRangeShort() {
                List<Short> expected = new ArrayList<>() {
                    {
                        add((short) 121);
                        add((short) 131);
                        add((short) 141);
                        add((short) 151);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((short) 120, (short) 155));
            }

            @Test
            void testNegativeRangeShort() {
                List<Short> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((short) -131, (short) 0));
            }

            @Test
            void testEmptyRangeByte() {
                List<Byte> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((byte) 122, (byte) 125));
            }

            @Test
            void testRangeSingleByte() {
                List<Byte> expected = new ArrayList<>() {
                    {
                        add((byte) 1);
                        add((byte) 2);
                        add((byte) 3);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((byte) 1, (byte) 4));
            }

            @Test
            void testRangeByte() {
                List<Byte> expected = new ArrayList<>() {
                    {
                        add((byte) 101);
                        add((byte) 111);
                        add((byte) 121);
                    }
                };
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((byte) 100, (byte) 125));
            }

            @Test
            void testNegativeRangeByte() {
                List<Byte> expected = new ArrayList<>();
                assertEquals(expected, Palindrome.getAllNumberPalindromesInRangeRecursive((byte) -125, (byte) 0));
            }
        }
    }
}

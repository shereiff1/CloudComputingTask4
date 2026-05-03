
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    // --- reverse ---
    @Test void reverse_normalString()    { Assertions.assertEquals("olleh", StringUtil.reverse("hello")); }
    @Test void reverse_emptyString()    { Assertions.assertEquals("", StringUtil.reverse("")); }
    @Test void reverse_nullInput()      { Assertions.assertNull(StringUtil.reverse(null)); }
    @Test void reverse_singleChar()     { Assertions.assertEquals("a", StringUtil.reverse("a")); }

    // --- isPalindrome ---
    @Test void palindrome_simpleTrue()  { Assertions.assertTrue(StringUtil.isPalindrome("racecar")); }
    @Test void palindrome_simpleFalse() { Assertions.assertFalse(StringUtil.isPalindrome("hello")); }
    @Test void palindrome_withSpaces()  { Assertions.assertTrue(StringUtil.isPalindrome("A man a plan a canal Panama")); }
    @Test void palindrome_nullInput()   { Assertions.assertFalse(StringUtil.isPalindrome(null)); }

    // --- countOccurrences ---
    @Test void count_basic()            { Assertions.assertEquals(3, StringUtil.countOccurrences("cat bat cat rat cat", "cat")); }
    @Test void count_caseInsensitive()  { Assertions.assertEquals(2, StringUtil.countOccurrences("Hello hello", "hello")); }
    @Test void count_noMatch()          { Assertions.assertEquals(0, StringUtil.countOccurrences("hello world", "xyz")); }
    @Test void count_nullText()         { Assertions.assertEquals(0, StringUtil.countOccurrences(null, "word")); }

    // --- titleCase ---
    @Test void titleCase_basic()        { Assertions.assertEquals("Hello World", StringUtil.titleCase("hello world")); }
    @Test void titleCase_mixedCase()    { Assertions.assertEquals("Java Is Fun", StringUtil.titleCase("JAVA IS FUN")); }
    @Test void titleCase_emptyString()  { Assertions.assertEquals("", StringUtil.titleCase("")); }
    @Test void titleCase_nullInput()    { Assertions.assertNull(StringUtil.titleCase(null)); }

    // --- isNullOrBlank ---
    @Test void blank_nullIsBlank()      { Assertions.assertTrue(StringUtil.isNullOrBlank(null)); }
    @Test void blank_spacesIsBlank()    { Assertions.assertTrue(StringUtil.isNullOrBlank("   ")); }
    @Test void blank_notBlank()         { Assertions.assertFalse(StringUtil.isNullOrBlank("hi")); }
}
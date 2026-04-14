package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("StringUtils Tests")
class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("Should reverse a string correctly")
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertEquals("a", stringUtils.reverse("a"));
        assertEquals("avaJ", stringUtils.reverse("Java"));
    }

    @Test
    @DisplayName("Should throw exception when reversing null")
    void testReverseNull() {
        assertThrows(IllegalArgumentException.class, () -> stringUtils.reverse(null));
    }

    @Test
    @DisplayName("Should detect palindromes correctly")
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("A man a plan a canal Panama"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome("java"));
    }

    @Test
    @DisplayName("Should convert string to uppercase")
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
        assertEquals("", stringUtils.toUpperCase(""));
    }

    @Test
    @DisplayName("Should check if string is empty correctly")
    void testIsEmpty() {
        assertTrue(stringUtils.isEmpty(null));
        assertTrue(stringUtils.isEmpty(""));
        assertTrue(stringUtils.isEmpty("   "));
        assertFalse(stringUtils.isEmpty("hello"));
        assertFalse(stringUtils.isEmpty(" hello "));
    }
}

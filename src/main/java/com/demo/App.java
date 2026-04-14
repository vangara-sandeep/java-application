package com.demo;

/**
 * Main application entry point.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=== Java Demo App ===");
        System.out.println("Build successful via GitHub Actions CI!");

        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 4 = " + calc.divide(20, 4));

        StringUtils utils = new StringUtils();
        System.out.println("Reversed 'hello': " + utils.reverse("hello"));
        System.out.println("Is 'racecar' a palindrome? " + utils.isPalindrome("racecar"));
    }
}

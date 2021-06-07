package com.practice.lesson6_for_while;

/**
 *  1. Написать программу высчитывающую факториал введённого числа используя рекурсию.
 */

public class RecursionExample {
    public static void main(String[] args) {

        int val = 6;
        System.out.println(factorial(val));

    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        // 6 * (5 * (4 * (3 * (2 * 1))))
        return value * factorial(value -1);
    }
}


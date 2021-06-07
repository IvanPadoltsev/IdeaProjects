package com.practice.lesson4_if_else;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра числом 3.
 */

public class Task2 {
    public static void main(String[] args) {
        // 3135154
        int val = 3135155;
        int testVal = val % 10;
        if (testVal == 3) {
            System.out.println("Последняя цифра числа это 3");
        } else  {
            System.out.println("Последняя цифра числа это НЕ 3");
        }
    }
}

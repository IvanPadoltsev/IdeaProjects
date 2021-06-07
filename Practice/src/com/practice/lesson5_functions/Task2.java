package com.practice.lesson5_functions;

/**
 *  2. Написать функцию, которая принимает один целочисленный параметр и возвращает значение, равное этому параметру,
 *    возведенному в куб.
 */


public class Task2 {
    public static void main(String[] args) {
        int value = 2;

        int result = expFor(value);
        System.out.print(value + "^3 = ");
        System.out.println(result + " - рассчёт куба числа через цикл for");

        int result1 = expWhile(value);
        System.out.print(value + "^3 = ");
        System.out.println(result1 + " - рассчёт куба числа через цикл while");
    }

    // Цикл while
    public static int expWhile(int value1) {
        int result = 1;
        int i = 1;
        while (i <= 3) {    // Где "3" - это степень числа
            i++;
            result *= value1;
        }
        return result;
    }

// Цикл for
    public static int expFor(int value1) {
        int result = 1;
        for (int i = 1; i <= 3; i++) {    // Где "3" - это степень числа
            result *= value1;
        }
        return result;
    }
}
package com.practice.lesson6_for_while;

/**
 *    2. Имеется число. Посчитать сумму цифр данного числа.
* */

public class Task2_Summa_cifr_chisla {
    public static void main(String[] args) {
        int value = 1245;
        int result = sum(value);      // WHILE
        System.out.println(result);

        int result1 = sumFor(value);      // FOR
        System.out.println(result1);
    }

    public static int sum(int value) {      // WHILE
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

        public static int sumFor(int value) {      // FOR
            int result = 0;
            for (int currentValue = value; currentValue != 0; currentValue /= 10) {
                result += currentValue % 10;
            }
            return result;
        }

}

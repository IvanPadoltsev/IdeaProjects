package com.practice.lesson6_for_while;

/**
 *   1. Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task1_Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(3));              // СПОСОБ 1 - Цикл for

        System.out.println(getFactorial(4));              // СПОСОБ 2 - Рекурсия, if-else

        System.out.println(getFactorialWhile(5));        // СПОСОБ 3 - Цикл while
    }


        public static int factorial(int lol) {      // СПОСОБ 1 - Цикл for
            int result = 1;
            for (int i = 1; i <= lol; i++) {
                result *= i;
            }
            return result;
        }

    public static int getFactorial(int f) {       // СПОСОБ 2 - Рекурсия, if-else
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }

    public static int getFactorialWhile(int lols) {     // СПОСОБ 3 - Цикл while
        int result = 1;
        int i = 1;
        while (i <= lols) {
            result *= i;
            i++;
        }
        return result;
    }

}


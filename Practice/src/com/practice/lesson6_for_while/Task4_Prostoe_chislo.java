package com.practice.lesson6_for_while;

/**
 * 4. Написать программу, определяющую, является ли введённое
 *    целое число простым, т.е. делится без остатка только на 1 и само
 *    на себя.
 */


public class Task4_Prostoe_chislo {

    public static void main(String[] args) {
       int value = 22;
       boolean result = prostoe(value);
       if (result == true) {
           System.out.println("Число: " + value + " простое");
       } else System.out.println("Число: " + value + " сложное, делится на кучу чисел");
    }

    public static boolean prostoe(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}


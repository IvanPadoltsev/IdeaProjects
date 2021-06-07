package com.practice.lesson4_if_else;

/**
 * 3. Имеется целое число, вводимое с консоли. Это число - сумма в рублях.
 * Вывести число, добавив к нему "рубль" в правильном падеже.
 */

public class Task3_Money {
    public static void main(String[] args) {
        int rubles = 4;
        // Рубль = 1 но !11
        // Рублей = 5, 6, 7, 8, 9, 10, 11-19
        // Рубля = 2, 3, 4
        int ten = (rubles % 10); // остаток от деления на 10
        int hndr = (rubles % 100); // остаток от деления на 100
        if (rubles % 10 == 1 && hndr !=11) {
            System.out.println(rubles + " Рубль");
        } else if ((ten == 2 || ten == 3 || ten == 4)
        && !(hndr == 12 || hndr == 13 || hndr == 14)) {
            System.out.println(rubles + " Рубля");
        } else {
                System.out.println(rubles + " Рублей");
               }
        }
    }

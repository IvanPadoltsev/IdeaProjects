package com.practice.lesson4_if_else;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем,
 *    и определяет, является ли этот год високосным.
 *    Год считается високосным, если он делится без остатка на 4.
 *    Однако, если год также делится на 100,
 *    то этот год не високосный, за исключением годов, делящихся на 400.
 *    Например:
 *    1992 - високосный
 *    1900 - не високосный
 *    2000 – високосный
 */

public class Task3_Years {
    public static void main(String[] args) {
        int year = 2001;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год - високосный");
        } else
            System.out.println(year + " год - НЕ високосный");
    }
}
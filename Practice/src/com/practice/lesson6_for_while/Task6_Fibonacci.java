package com.practice.lesson6_for_while;
import java.util.Scanner;

/**
 * 2. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 *     Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */

public class Task6_Fibonacci {


//    public static void main(String[] args) {
//        System.out.println("При помощи массива:");
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; ++i) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        for (int i = 0; i < arr.length; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int value = recursionFibonacci(10); // 10-е по счёту число Фибоначчи
//        System.out.println("Рекурсия:");
//        System.out.println(value);
//        }
//
//
//        public static int recursionFibonacci(int n) {
//                if (n <= 1) {
//                return 1;
//                } else if (n == 2) {
//                    return 1;
//                } else  {
//                    return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
//                }
//        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input threshold: ");
        int threshold = scanner.nextInt();

        printFibonacciRecursion(threshold);
    }

    public static void printFibonacci(int threshold) {
        int first = 0;
        int second = 1;
        while (second < threshold) {
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void printFibonacciRecursion(int threshold) {
        int first = 0;
        int second = 1;
        fibonacci(first, second, threshold);
    }

    public static void fibonacci(int first, int second, int threshold) {
        if (second < threshold) {
            System.out.println(second);
            fibonacci(second, first + second, threshold);
        }
    }




}


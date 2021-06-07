package com.practice.lesson7_arrays;

public class StringToIntCalculateSum {
    public static void main(String[] args) {
        String input = "1234567";
        System.out.println("Сумма чисел в строке = " + calculateSum(input));
    }

    public static Integer calculateSum(String input) {
        int a = Integer.valueOf(input);
        int sum = 0;
        for (int i = 0 ; i < a; a /= 10) {
            sum += a % 10 ;
        }
        return sum;
    }
}

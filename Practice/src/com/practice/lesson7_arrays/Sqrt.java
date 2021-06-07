package com.practice.lesson7_arrays;

import org.w3c.dom.ls.LSOutput;

public class Sqrt {
    public static void main(String[] args) {
        int value = 16;
        methodSqrt(value);
    }

    public static void methodSqrt(int x) {
        double stepen = 1.0 / 2.0;
        int value = (int) Math.pow(x, stepen);
        System.out.println("Корень из числа: " + x + " равен: " + value);
    }

}

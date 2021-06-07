package com.practice.lesson7_arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
import java.util.Arrays;

public class shiftRight {
    public static void main(String[] args) {
        int [] values = {1, 2, 3, 2, 5, 2, 7, 2, 9, 0};
        System.out.println(Arrays.toString(values));
        System.out.println(" ");
//            shiftRight(values);
//            System.out.println(Arrays.toString(values));
            deleteDuplicate(values);
            System.out.println(Arrays.toString(values));
    }

    public static void deleteDuplicate(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] == values[i])
                    values[j] = 0;
            }
        }
    }

    public static void shiftRight(int[] values) {
        int lastElement = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;
    }

}

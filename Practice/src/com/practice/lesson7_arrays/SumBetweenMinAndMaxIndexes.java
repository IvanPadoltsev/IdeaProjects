package com.practice.lesson7_arrays;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class SumBetweenMinAndMaxIndexes {
    public static void main(String[] args) {
        //              0   1  2  3  4  5  6  7  8  9   10
        int[] values = {12, 3, 15, 2, 4, 7, 5, 9, 8, 1, 10};
        System.out.println("MIN Index: " + findMinIndex(values));
        System.out.println("MAX Index: " + findMaxIndex(values));
        System.out.println("SUMM BETWEEN MIN and MAX: " + sumValuesBetween(values));

    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue ) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int sumValuesBetween(int[] values) {
        int sum = 0;
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += values[i];
        }
        return sum;
    }

}

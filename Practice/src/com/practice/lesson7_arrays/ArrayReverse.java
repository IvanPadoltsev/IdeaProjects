package com.practice.lesson7_arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] array = {1 ,2 ,3, 4, 5, 6, 7, 8};
        printArrayReverse(array);
    }

    public static void printArrayReverse( int massive[]) {
        for (int i = massive.length - 1; i >= 0 ; i--) {
            System.out.print(massive[i] + " ");
        }
    }

}

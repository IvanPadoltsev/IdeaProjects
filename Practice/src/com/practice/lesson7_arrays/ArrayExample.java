package com.practice.lesson7_arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int value = 10;
        //              0  1  2  3  4  5
        int[] array =  {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма чисел массива = " + sumArray(array));
    }


public static int sumArray(int summ[]) {
        int values = 0;
        for (int i = 0; i <= summ.length; i++) {
        values += i;
    }
    return values;
}

}

package com.practice.lesson3_operations_with_variables;

public class Task {
    public static void main(String[] args) {

        int a = 7;
        int b = 3;
// Деление по модулю, показывает остаток от деления
//        int value = a % b;
//        System.out.println(value + " - остаток от деления");

// Приведение типов. Чтобы показать остаток, нужно привести результат к типу "double", а так же один из аргументов
        double value = a / (double)b;
        System.out.println(value + " - деление с остатком");
    }
}

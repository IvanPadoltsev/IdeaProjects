package com.practice.lrsson6_for_while;

public class WhileExample {

    public static void main(String[] args) {

            // "do while" - цикл с постусловием, сработает как минимум 1 раз.

        int value = 0;
        do {
            System.out.println(value);
            value++; // value += 1 ; value = value + 1;
        } while (value <= 10);
    }


            // "while" - цикл с условием, проверяется сразу.

//        int value = 10;
//        while (value >= 0) {
//            System.out.println(value);
//            value--; // value = value - 1;
//        }
    }

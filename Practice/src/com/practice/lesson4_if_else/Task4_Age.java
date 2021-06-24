package com.practice.lesson4_if_else;

/**
 * В русском языке в зависимости от числа, слово «год» может заменяться на «года» или «лет».
 * Например, мы говорим «1 год», «2 года», «10 лет», «11 лет», «21 год».
 * Ваша задача – сформулировать закономерность, по которой для конкретного числа выбирается конкретное слово – год/года/лет.
 * Закономерность может состоять из нескольких правил.
 */

public class Task4_Age {
    public static void main(String[] args) {
        int age = 110;
        String old = "";
        int ageLastNumber = age % 10;
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (isExclusion) {
            old = "лет";
        } else if (ageLastNumber == 1) {
            old = "год";
        } else if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            old = "года";
        } else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
            old = "лет";
        } else {
                System.out.println("Шо?...");
        }
        System.out.println(age + " " + old);
    }
}

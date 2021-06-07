package com.practice.lesson4_if_else.switch_case;

public class switch_case {
        public static void main(String[] args) {
            // byte, short, int, char, String, enum
            int value = 101;
            switch (value) {
                case 1 -> System.out.println("Это 1");
                case 10 -> System.out.println("Это 10");
                case 25 -> System.out.println("Это 25");
                default -> System.out.println("Эт фигня какая-то");
            }
        }
    }

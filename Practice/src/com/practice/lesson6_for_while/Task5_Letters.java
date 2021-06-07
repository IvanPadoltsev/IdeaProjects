package com.practice.lesson6_for_while;

public class Task5_Letters {
    public static void main(String[] args) {

        printLetters();
    }

    public static void printLetters() {
        for (char letter = 'b'; letter <= 'z'; letter++) {
            if (letter == 'a' || letter == 'e' || letter == 'y' || letter == 'u' || letter == 'i' || letter == 'o') {
                break;
            }
            System.out.print(letter + " ");
        }
    }

}


//letters();
//
//    }
//    public static void letters() {
//
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//            System.out.print(letter + " ");
//        }
//        return;
//    }
//}

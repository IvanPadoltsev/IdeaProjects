package com.practice.lesson2_data_types_and_variables;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.sound.midi.Soundbank;

public class Variables {
    public static void main(String[] args) {

        int  a = 10;
        int b = 4;

        System.out.println(a);
        for (int i = 1; i <= b; i++) {
                        a *= 10;
            System.out.println(a);
        }

        float c = 10;
        for (int i = 1; i <= b; i++) {
            c /= 10;
            System.out.println(c);
        }

        System.out.println((float)Math.PI);
        System.out.println((double)Math.PI);

        System.out.println('\u03A3' + "" + '\u221A' + "" + '\u03C0');
        System.out.println('\u2211' + "" + '\u221A' + "" + '\u03C0');


        System.out.println(Character.isLowerCase('a'));
    }
}

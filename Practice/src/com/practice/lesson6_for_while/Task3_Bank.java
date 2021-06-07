package com.practice.lesson6_for_while;

/**
*   3. В 1626 году индейцы продали Манхэттен за 24$.
   Написать программу, которая высчитывает сумму,
   получившуюся бы в текущем году, если бы индейцы положили эти
   деньги в банк под 5% годовых.
*/


public class Task3_Bank {
    public static void main(String[] args) {
    int sourceSum = 24;
    double itog = sum(sourceSum);

        System.out.println("У индейцев бы сейчас накопилось: " + itog + " баксов... Эх...");
    }


    public static double sum(double sourceSum){
        double result = sourceSum;
                for (int year = 1626 + 1; year <= 2020; year++) {
                double percent = result * 0.05;
                result += percent;
                    System.out.println("Год: " + year + ", сумма: " + result + " бачей");
                }
            return result;
    }

}

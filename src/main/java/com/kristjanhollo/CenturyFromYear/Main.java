package com.kristjanhollo.CenturyFromYear;

/**
 * The first century spans from the year 1 up to and including the year 100, The second -
 * from the year 101 up to and including the year 200, etc.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println(century(2000));

        System.out.println(1705 / 100.0);
        System.out.println(1705 / 100);
        System.out.println((1705 / 100.0) - (1705 / 100));
        System.out.println((2000 / 100.0) - (2000 /100));
        double a = 1705 / 100.0D;
        int b = 1705 / 100;
        double check = a - b;
        System.out.println(check);
    }

    public static int century(int number) {
        double a = number / 100.0D;
        int b = number / 100;
        double check = a - b;
        if (check > 0) {
            return number / 100 + 1;
        } else {
            return number / 100;
        }

    }
}

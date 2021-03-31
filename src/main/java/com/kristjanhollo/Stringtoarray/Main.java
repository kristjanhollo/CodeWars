package com.kristjanhollo.Stringtoarray;

/**
 * "Robin Singh" ==> ["Robin", "Singh"]
 *
 * "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */

public class Main {
    public static void main(String[] args) {
        int dividend = 3;
        int divisor = 2;

        double result = dividend / divisor * 1.0;
        System.out.println(result);
    }
    public static String[] stringToArray(String s) {
        String[] words = s.split(" ");
        return words;
    }
}

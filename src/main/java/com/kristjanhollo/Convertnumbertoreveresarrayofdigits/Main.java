package com.kristjanhollo.Convertnumbertoreveresarrayofdigits;

/**
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 *
 * Example:
 * 348597 => [7,9,5,8,4,3]
 */

public class Main {
    public static void main(String[] args) {
        int n = 34859;
        digitize(n);
    }
    public static int[] digitize(long n) {
        String length = String.valueOf(n);
        int x = length.length();
        int[] array = new int[x];
        int counter = 0;
        while(counter < x) {
            array[counter] += n % 10;
            n /= 10;
            counter++;
        }
        return array;
    }
}

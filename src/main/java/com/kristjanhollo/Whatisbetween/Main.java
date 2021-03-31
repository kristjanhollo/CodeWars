package com.kristjanhollo.Whatisbetween;

/**
 * Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the
 * input parameters, including them.
 *
 * For example:
 *
 * a = 1
 * b = 4
 * --> [1, 2, 3, 4]
 */

public class Main {
    public static void main(String[] args) {
        between(-2, 2);
    }

    public static int[] between(int a, int b) {
        int length = 0;
        for(int k = a; k <= b; k++){
            length++;
        }

        int[] array = new int[length];
        int first = a;

        for(int i = 0; i < length; i++){
            array[i] = first;
            first++;

        }
        return array;
    }
}

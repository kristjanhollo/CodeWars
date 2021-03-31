package com.kristjanhollo.Lostwithoutmap;

/**
 * Given an array of integers, return a new array with each value doubled.
 * <p>
 * For example:
 * <p>
 * [1, 2, 3] --> [2, 4, 6]
 * <p>
 * For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(map(new int[] {2, 4, 6}));
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}

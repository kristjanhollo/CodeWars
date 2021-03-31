package com.kristjanhollo.Negativepositive;

/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.

 invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []

 */

public class NegativePositive {
    public static void main(String[] args) {
    }

    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return result;
            } else {
                result[i] = (array[i] * -1);
            }
        }
        return result;
    }
}

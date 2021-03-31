package Squareeverydigit;

import java.util.Arrays;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 */

public class Main {
    public static void main(String[] args) {

    }

    public int squareDigits(int n) {
        int finalSum = 0;
        String sum = "";
        String nString = Integer.toString(n);
        String[] array = nString.split("");
        for (String number : array) {
            int[] arrayNumbers = {Integer.parseInt(number)};
            for (int i = 0; i < arrayNumbers.length; i++) {
                sum += arrayNumbers[i] * arrayNumbers[i];
                finalSum = Integer.parseInt(sum);
            }
        }
        return finalSum;
    }
}

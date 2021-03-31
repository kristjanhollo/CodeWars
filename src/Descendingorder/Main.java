package Descendingorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * <p>
 * Examples:
 * Input: 42145 Output: 54421
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 123456789 Output: 987654321
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
        System.out.println(sortDesc(0));
        System.out.println(sortDesc(15));
        System.out.println(sortDesc(0112));
    }

    public static int sortDesc(final int num) {
        List<String> numAsList = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            numAsList.add(i, String.valueOf(num).substring(i, i + 1));
        }
        Collections.sort(numAsList, Collections.reverseOrder());
        String numAsString = "";
        for (String digit : numAsList) {
            numAsString = numAsString.concat(digit);
        }
        return Integer.parseInt(numAsString);
    }
}

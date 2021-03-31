package Vovelcount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 *
 * The input string will only consist of lower case letters and/or spaces.
 */

public class Main {
    public static void main(String[] args) {
        String text = "abracadabra";
        System.out.println(getCount(text));
    }

    public static int getCount(String str) {
        int vovelCount = 0;
        String[] strArray = str.split("");
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].contains("a") || strArray[i].contains("e")
            || strArray[i].contains("i") || strArray[i].contains("o")
            || strArray[i].contains("u")) {
                vovelCount++;
            }
        } return vovelCount;
    }
}


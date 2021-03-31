package Mumbling;

import java.util.Locale;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String[] strArray = s.toUpperCase().split("");
        String finalString = "";
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] += strArray[i].repeat(i).toLowerCase(Locale.ROOT);
        }
        for(String word: strArray) {
            finalString += word + "-";
        }
        finalString = finalString.substring(0,finalString.length()-1);
        return finalString;
    }
}

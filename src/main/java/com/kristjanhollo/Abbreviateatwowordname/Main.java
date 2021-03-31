package com.kristjanhollo.Abbreviateatwowordname;

import java.util.Arrays;
import java.util.Locale;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 *
 * The output should be two capital letters with a dot separating them.
 *
 * It should look like this:
 *
 * Sam Harris => S.H
 *
 * Patrick Feeney => P.F
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(abbrevName("Kristjan Hollo Peeter"));
    }

    public static String abbrevName(String name) {
        String[] array = name.split(" ");
        return array[0].substring(0,1).toUpperCase(Locale.ROOT) + "." + array[1].substring(0,1).toUpperCase();
    }
}

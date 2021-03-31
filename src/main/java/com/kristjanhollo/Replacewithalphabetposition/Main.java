package com.kristjanhollo.Replacewithalphabetposition;

import java.util.Locale;

/**
 * Welcome.
 *
 * In this kata you are required to, given a string, replace every letter with its position in the alphabet.
 *
 * If anything in the text isn't a letter, ignore it and don't return it.
 *
 * "a" = 1, "b" = 2, etc.
 *
 * Example
 * alphabet_position("The sunset sets at twelve o' clock.")
 * Should return "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11" (as a string)
 */

public class Main {
    public static void main(String[] args) {
    String text = "The sunset sets at twelve o' clock.";
    String textStripLow = text.toLowerCase();
    String[] alphabet = {"ä","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] textArr = textStripLow.split("");
    String numberString = "";
        for(int i = 0; i < textArr.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if (textArr[i].equals(alphabet[j])) {
                    numberString += j + " ";
                }
            }
        }
        System.out.println(numberString);
    }
}

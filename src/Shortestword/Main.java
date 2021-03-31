package Shortestword;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }

    public static int findShort(String s) {
    String[] strArray = s.split(" ");
        int min = strArray[0].length();
        int max = 0;
        int minAnswer = 0;
    for(int i = 0; i < strArray.length; i++) {
        minAnswer = strArray[i].length();
        if(minAnswer < min) {
            min = minAnswer;
        }

    }
    return min;
    }

}

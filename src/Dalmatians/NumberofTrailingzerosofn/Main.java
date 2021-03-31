package Dalmatians.NumberofTrailingzerosofn;

/**
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 * <p>
 * N! = 1 * 2 * 3 * ... * N
 * <p>
 * Be careful 1000! has 2568 digits...
 * <p>
 * For more info, see: http://mathworld.wolfram.com/Factorial.html
 * <p>
 * Examples
 * zeros(6) = 1
 * # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
 * <p>
 * zeros(12) = 2
 * # 12! = 479001600 --> 2 trailing zeros
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(zeros(14));
        System.out.println(zeros(12));
        System.out.println(zeros(6));
        System.out.println(zeros(20));
    }

    public static int zeros(int n) {

        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }


}

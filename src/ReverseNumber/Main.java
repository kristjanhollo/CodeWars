package ReverseNumber;

/**
 * Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)
 *
 * Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.
 *
 * Examples
 *  123 ->  321
 * -456 -> -654
 * 1000 ->    1
 */


public class Main {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
//        System.out.println(reverse(1000));
//        System.out.println(reverse(-456));
        System.out.println(reverse(-598930828));
    }

    public static int reverse(int number) {
        long reverse = 0;
        while(number!=0) {
            reverse += number % 10;
            number /= 10;
            reverse *= 10;
        }
        reverse /= 10;
        return (int)reverse;
    }
}

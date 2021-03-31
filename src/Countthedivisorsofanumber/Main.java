package Countthedivisorsofanumber;

/**
 * Count the number of divisors of a positive integer n.
 *
 * Random tests go up to n = 500000.
 *
 * Examples
 * numberOfDivisors(4)  == 3 // 1, 2, 4
 * numberOfDivisors(5)  == 2 // 1, 5
 * numberOfDivisors(12) == 6 // 1, 2, 3, 4, 6, 12
 * numberOfDivisors(30) == 8 // 1, 2, 3, 5, 6, 10, 15, 30
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4));
        System.out.println(numberOfDivisors(5));
        System.out.println(numberOfDivisors(12));
        System.out.println(numberOfDivisors(30));
    }

    public static long numberOfDivisors(int n) {
        long count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }
}

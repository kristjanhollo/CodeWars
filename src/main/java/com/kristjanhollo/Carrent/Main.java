package com.kristjanhollo.Carrent;

public class Main {
    public static void main(String[] args) {
        System.out.println(rentalCarCost(1));
        System.out.println(rentalCarCost(2));
        System.out.println(rentalCarCost(3));
        System.out.println(rentalCarCost(4));
        System.out.println(rentalCarCost(5));
        System.out.println(rentalCarCost(6));
        System.out.println(rentalCarCost(7));
        System.out.println(rentalCarCost(8));
        System.out.println(rentalCarCost(9));
        System.out.println(rentalCarCost(10));
    }

    public static int rentalCarCost(int d) {
        int rent = 40;
        if (d < 7 && d >= 3) {
            return rent * d - 20;
        } else if (d <= 2) {
            return rent * d;
        } else if (d <= 10) {
            return rent * d - 50;
        } else {
            return rent * d - 70 - (d / 3);
        }

    }
}

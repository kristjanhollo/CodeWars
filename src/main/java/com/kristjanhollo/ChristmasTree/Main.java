package com.kristjanhollo.ChristmasTree;

public class Main {
    public static void printStars(int number) {
        while (number != 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size + 2; i++) {
            printSpaces(size);
            size--;
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for(int i = 1; i < height; i++) {
            printSpaces(height);
            printTriangle(10);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
//            printStars(5);
//            printSpaces(4);
//            printStars(5);
        printTriangle(5);
//        System.out.println("---");
//        christmasTree(4);
//        System.out.println("---");
//        christmasTree(10);
    }
}


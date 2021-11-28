package com.company;

public class E6StairCase {
    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}

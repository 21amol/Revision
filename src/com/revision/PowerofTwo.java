package com.revision;

import java.util.Scanner;

public class PowerofTwo {
    static Scanner scan = new Scanner(System.in);

    public static void powerOf2() {
        System.out.println("Enter the power of 2: ");
        int value = scan.nextInt();

        System.out.println("See the Result below: ");
            if (value >= 31) {
                System.out.println("Try power of 2 in between 0 and 31");
                powerOf2();

            } else {
                for (int i = 0; i <= value; i++) {
                double result = Math.pow(2, i);
                System.out.println("2^" + i + " = " + result);
            }
        }
    }

    public static void main(String[] args) {
        powerOf2();

    }
}

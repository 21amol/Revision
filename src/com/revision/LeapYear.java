package com.revision;

import java.util.Scanner;

public class LeapYear {
    static Scanner scan = new Scanner(System.in);

    public static void leapYear() {
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is not a leap year");
    }

    public static void main(String[] args) {
        leapYear();


    }
}

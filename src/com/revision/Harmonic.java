package com.revision;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Harmonic {
    static Scanner scan = new Scanner(System.in);

    public static void harmonic() {
        int i = 2;
        System.out.println("Enter the value: ");
        int value = scan.nextInt();
        System.out.println("See the below Result ");
        if (value == 0) {
            System.out.println("Value cannot be 0!!! Try again");
            harmonic();

        } else {
            System.out.print("1/1");
            while (i <= value) {
                System.out.print( " + " + "1/"+i );
                i++;
            }
        }
    }

    public static void main(String[] args) {
        harmonic();
    }
}

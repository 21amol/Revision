package com.revision;

import java.util.Objects;
import java.util.Scanner;

public class CoinFlip {

        static Scanner scan = new Scanner(System.in);

        public static void coinFlipping() {

            System.out.println("Enter the face you want to keep first (H or T)");
            String face = scan.nextLine();
            System.out.println("How many times you want to flip the coin");
            int value = scan.nextInt();

            if (Objects.equals(face, "H") && (value % 2 == 0)) { // objects.equal used  as face == "H" (better approach)
                System.out.println("Its a Head");
            } else if (Objects.equals(face, "T") && (value % 2 != 0)) {
                System.out.println("Its a Head");
            } else
                System.out.println("Its a Tail");
        }

        public static void main(String[] args) {
            //System.out.println("Hello and Welcome to revision Chapters...");
            coinFlipping();
        }
}

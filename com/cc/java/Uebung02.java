package com.cc.java;

import java.util.Scanner;

public class Uebung02 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die erste ganze Zahl ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Bitte geben Sie die zweite ganze Zahl ein: ");
        int zahl2 = scanner.nextInt();

        int summe = zahl1 + zahl2;
        System.out.println("Die Summe lautet: " + summe);

        scanner.close();
    }
}



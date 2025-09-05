package com.cc.java;

import java.util.Scanner;

public class Uebung04 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine ganze Zahl von 0 bis 15 ein: ");
        int zahl = scanner.nextInt();

        if (zahl < 0 || zahl > 15) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl von 0 bis 15 ein.");
            scanner.close();
            return;
        }

        String dualzahl = "";
        int temp = zahl;
        do {
            dualzahl = (temp % 2) + dualzahl;
            temp = temp / 2;
        } while (temp > 0);

        System.out.println("Die Dualzahl lautet: " + dualzahl);

        scanner.close();
    }
}
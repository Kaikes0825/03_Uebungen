package com.cc.java;

import java.util.Scanner;

public class Uebung03 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        System.out.print("Welche Rechenoperation möchten Sie durchführen? (Addition, Subtraktion, Multiplikation, Division): ");
        String operation = scanner.next().toLowerCase();

        double ergebnis;
        switch (operation) {
            case "addition":
                ergebnis = zahl1 + zahl2;
                break;
            case "subtraktion":
                ergebnis = zahl1 - zahl2;
                break;
            case "multiplikation":
                ergebnis = zahl1 * zahl2;
                break;
            case "division":
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Unbekannte Operation.");
                scanner.close();
                return;
        }

        System.out.println("Das Ergebnis lautet: " + ergebnis);

        scanner.close();
    }
}
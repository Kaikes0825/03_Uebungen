package com.cc.java;

import java.util.Scanner;

public class Uebung01 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("Diese Zahl ist gerade.");
        } else {
            System.out.println("Diese Zahl ist ungerade.");
        }

        scanner.close();
    }
}

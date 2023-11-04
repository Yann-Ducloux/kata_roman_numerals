package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        convertir(scanner);
    }

    private static void convertir(Scanner scanner) {
        convertion(recupNombre(scanner));
        convertir(scanner);
    }

    private static void convertion(int numberIndia) {
        Convert convert = new Convert();
        String numberRomanActual = convert.convert(numberIndia);
        System.out.println(numberRomanActual);
    }

    private static int recupNombre(Scanner scanner) {
        System.out.println("nombre à convertir");
        String number = scanner.nextLine();
        int numberIndia = Integer.parseInt(number);
        return numberIndia;
    }
}
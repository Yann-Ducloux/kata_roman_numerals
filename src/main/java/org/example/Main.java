package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre à convertir");

        String number = scanner.nextLine();
        Integer numberIndia = Integer.parseInt(number);
        Convert convert = new Convert();
        String numberRomanActual = convert.convert(numberIndia);
        System.out.println(numberRomanActual);
    }
}
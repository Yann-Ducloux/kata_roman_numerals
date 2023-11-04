package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

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
        logger.info(numberRomanActual);
    }

    private static int recupNombre(Scanner scanner) {
        logger.info("nombre à convertir");
        String number = scanner.nextLine();
        return Integer.parseInt(number);
    }
}
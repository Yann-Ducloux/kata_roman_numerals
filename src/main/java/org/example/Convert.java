package org.example;

public class Convert {

    public String convert(int number) {
        CalculRoman calculRoman = new CalculRoman(number);
        calculRoman.recupRoman();
        return calculRoman.getNumberRoman().toString();
    }
}

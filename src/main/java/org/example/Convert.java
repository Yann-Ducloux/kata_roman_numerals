package org.example;

import java.util.HashMap;
import java.util.Map;

public class Convert {

    public static final String ONE_ROMAN = "I";
    public static final String FIVE_ROMAN = "V";
    public static final String TEN_ROMAN = "X";
    public static final int TEN_INDIA = 10;
    public static final int FOUR_INDIA = 4;
    public static final int FIVE_INDIA = 5;
    public static final int ONE_INDIA = 1;
    public static final int ZERO = 0;

    public String convert(int number) {
        CalculRoman calculRoman = new CalculRoman(number);
        calculRoman.recupRoman();
        return calculRoman.getNumberRoman().toString();
    }

    private static Map<Integer, String> recupNumberRoman() {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(ONE_INDIA, ONE_ROMAN);
        stringMap.put(FIVE_INDIA, FIVE_ROMAN);
        stringMap.put(TEN_INDIA, TEN_ROMAN);
        return stringMap;

    }
}

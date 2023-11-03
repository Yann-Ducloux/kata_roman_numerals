package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

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
        return recupRoman(number, recupNumberRoman());
    }

    private static Map<Integer, String> recupNumberRoman() {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(ONE_INDIA, ONE_ROMAN);
        stringMap.put(FIVE_INDIA, FIVE_ROMAN);
        stringMap.put(TEN_INDIA, TEN_ROMAN);
        return stringMap;
    }

    private static String recupRoman(int number, Map<Integer, String> stringMap) {
        if (stringMap.containsKey(number + ONE_INDIA)) {
            return ONE_ROMAN + stringMap.get(number + ONE_INDIA);
        } else if(number >= TEN_INDIA) {
            return TEN_ROMAN;
        } else if (number>= FIVE_INDIA) {
            return FIVE_ROMAN + addI(number - FIVE_INDIA);
        }
        return addI(number);

    }

    private static String addI(int number) {
        return ONE_ROMAN.repeat(Math.max(ZERO, number));
    }
}

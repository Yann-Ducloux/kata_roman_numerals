package org.example;

import java.util.*;

public class CalculRoman {
    StringBuffer numberRoman;
    Integer reste;
    Map<Integer, String> stringMap;

    public static final String ONE_ROMAN = "I";
    public static final String FIVE_ROMAN = "V";
    public static final String TEN_ROMAN = "X";
    public static final Integer TEN_INDIA = 10;
    public static final Integer FOUR_INDIA = 4;
    public static final Integer FIVE_INDIA = 5;
    public static final Integer ONE_INDIA = 1;
    public static final Integer ZERO = 0;

    public CalculRoman(Integer reste) {
        this.reste = reste;
        this.numberRoman = new StringBuffer();
        recupNumberRoman();
    }

    private void recupNumberRoman() {
        stringMap = new HashMap<>();
        stringMap.put(TEN_INDIA, TEN_ROMAN);
        stringMap.put(FIVE_INDIA, FIVE_ROMAN);
    }
    public void recupRoman() {
        recupValeurMoinsUn();
        addLetterDiffrentI();
        addI();
        reloadRecupRoman();
    }

    private void recupValeurMoinsUn() {
        if (stringMap.containsKey(this.reste + ONE_INDIA)) {
            numberRoman.append(ONE_ROMAN).append(stringMap.get(this.reste + ONE_INDIA));
            this.reste = 0;
        }
    }

    private void addLetterDiffrentI() {
        boolean boRecupValue = true;
        List<Integer> integerList = new ArrayList<>(stringMap.keySet());
        Collections.reverse(integerList);
        for (int i = 0; i < integerList.size()&& boRecupValue; i++) {
            if (this.reste >= integerList.get(i)) {
                this.numberRoman.append(stringMap.get(integerList.get(i)));
                this.reste -= integerList.get(i);
                boRecupValue = false;
            }
        }
    }

    private void reloadRecupRoman() {
        if (this.reste>4) {
            recupRoman();
        }
    }

    private void addI() {
        if (this.reste<4) {
            numberRoman.append(addI(this.reste));
        }
    }

    private void extracted(Integer indiaNumber) {
        if (this.reste >= indiaNumber) {
            this.numberRoman.append(stringMap.get(indiaNumber));
            this.reste -= indiaNumber;
        }
    }

    private static String addI(int number) {
        return ONE_ROMAN.repeat(Math.max(ZERO, number));
    }

    public StringBuffer getNumberRoman() {
        return numberRoman;
    }
}

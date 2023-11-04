package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "24, XXIV",
            "38, XXXVIII",
    })
    void numberConvert(int numberIndia, String numberRomanExpected ) {
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
}
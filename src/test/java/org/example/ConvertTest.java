package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertTest {

    @Test
    public void numberI() {
        //GIVEN
        int numberIndia = 1;
        String numberRomanExpected = "I";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberII() {
        //GIVEN
        int numberIndia = 2;
        String numberRomanExpected = "II";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberIII() {
        //GIVEN
        int numberIndia = 3;
        String numberRomanExpected = "III";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberIV() {
        //GIVEN
        int numberIndia = 4;
        String numberRomanExpected = "IV";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberV() {
        //GIVEN
        int numberIndia = 5;
        String numberRomanExpected = "V";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberVII() {
        //GIVEN
        int numberIndia = 7;
        String numberRomanExpected = "VII";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberIX() {
        //GIVEN
        int numberIndia = 9;
        String numberRomanExpected = "IX";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
    @Test
    public void numberX() {
        //GIVEN
        int numberIndia = 10;
        String numberRomanExpected = "X";
        Convert convert = new Convert();
        //THEN
        String numberRomanActual = convert.convert(numberIndia);

        //WHEN
        assertEquals(numberRomanExpected, numberRomanActual);
    }
}
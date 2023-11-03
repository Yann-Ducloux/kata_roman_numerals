package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertTest {

    @Test
    public void numberI() {
        //GIVEN
        int one = 1;
        String numberOne = "I";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(one);

        //WHEN
        assertEquals(numberOne, tst);
    }
    @Test
    public void numberII() {
        //GIVEN
        int two = 2;
        String numberTwo = "II";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberIII() {
        //GIVEN
        int two = 3;
        String numberTwo = "III";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberIV() {
        //GIVEN
        int two = 4;
        String numberTwo = "IV";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberV() {
        //GIVEN
        int two = 5;
        String numberTwo = "V";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberVII() {
        //GIVEN
        int two = 7;
        String numberTwo = "VII";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberIX() {
        //GIVEN
        int two = 9;
        String numberTwo = "IX";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
    @Test
    public void numberX() {
        //GIVEN
        int two = 10;
        String numberTwo = "X";
        Convert convert = new Convert();
        //THEN
        String tst = convert.convert(two);

        //WHEN
        assertEquals(numberTwo, tst);
    }
}
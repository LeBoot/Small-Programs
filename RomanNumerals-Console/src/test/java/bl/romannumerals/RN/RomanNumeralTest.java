/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.romannumerals.RN;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class RomanNumeralTest {
    
    RomanNumeral rn = new RomanNumeral();

    /**
     * Test of validateRomanNumeral method, of class RomanNumeral.
     */
    @Test
    public void testValidateRomanNumeral_1() {
        String input = "i";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_2() {
        String input = "iv";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_3() {
        String input = "xiv";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_4() {
        String input = "mi";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_5() {
        String input = "iii";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_6() {
        String input = "xxx";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_7() {
        String input = "xxiv";
        assertTrue(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_8() {
        String input = "iiii";
        assertFalse(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_9() {
        String input = "vvv";
        assertFalse(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_10() {
        String input = "vx";
        assertFalse(rn.validateRomanNumeral(input));
    }
    
    @Test
    public void testValidateRomanNumeral_11() {
        String input = "im";
        assertFalse(rn.validateRomanNumeral(input));
    }

    /**
     * Test of convertRomanToArabic method, of class RomanNumeral.
     */
    @Test
    public void testConvertRomanToArabic_1() {
        String input = "ix";
        assertEquals(9, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_2() {
        String input = "i";
        assertEquals(1, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_3() {
        String input = "xix";
        assertEquals(19, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_4() {
        String input = "xxx";
        assertEquals(30, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_5() {
        String input = "ii";
        assertEquals(2, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_6() {
        String input = "c";
        assertEquals(100, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_7() {
        String input = "lv";
        assertEquals(55, rn.convertRomanToArabic(input));
    }
    
    @Test
    public void testConvertRomanToArabic_8() {
        String input = "mm";
        assertEquals(2000, rn.convertRomanToArabic(input));
    }

    /**
     * Test of convertArabicToRoman method, of class RomanNumeral.
     */
    @Test
    public void testConvertArabicToRoman_1() {
        int input = 1;
        assertEquals("i", rn.convertArabicToRoman(input));
    }
    
    @Test
    public void testConvertArabicToRoman_2() {
        int input = 11;
        assertEquals("xi", rn.convertArabicToRoman(input));
    }
    
    @Test
    public void testConvertArabicToRoman_3() {
        int input = 105;
        assertEquals("cv", rn.convertArabicToRoman(input));
    }
    
    @Test
    public void testConvertArabicToRoman_4() {
        int input = 1000;
        assertEquals("m", rn.convertArabicToRoman(input));
    }
    
    @Test
    public void testConvertArabicToRoman_5() {
        int input = 27;
        assertEquals("xxvii", rn.convertArabicToRoman(input));
    }
    
}

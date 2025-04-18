package edu.froliak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
  @author eugen
  @project LabWork_3_4
  @class ConverterTest
  @version 1.0.0
  @since 3/29/2025 - 16.53
*/class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertToRoman(3));
    }

    @Test
    void whenArabic_4_ThenRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
    void whenArabic_5_ThenRoman_V() {
        Assertions.assertEquals("V", Converter.convertToRoman(5));
    }

    @Test
    void whenArabic_8_ThenRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertToRoman(8));
    }

    @Test
    void whenArabic_9_ThenRoman_IX() {
        Assertions.assertEquals("IX", Converter.convertToRoman(9));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertToRoman(10));
    }

    @Test
    void whenArabic_11_ThenRoman_XI() {
        Assertions.assertEquals("XI", Converter.convertToRoman(11));
    }

    @Test
    void whenArabic_15_ThenRoman_XV() {
        Assertions.assertEquals("XV", Converter.convertToRoman(15));
    }

    @Test
    void whenArabic_18_ThenRoman_XVIII() {
        Assertions.assertEquals("XVIII", Converter.convertToRoman(18));
    }

    @Test
    void whenArabic_20_ThenRoman_XX() {
        Assertions.assertEquals("XX", Converter.convertToRoman(20));
    }

    @Test
    void whenArabic_28_ThenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", Converter.convertToRoman(28));
    }

    @Test
    void whenArabic_30_ThenRoman_XXX() {
        Assertions.assertEquals("XXX", Converter.convertToRoman(30));
    }

    @Test
    void whenArabic_38_ThenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", Converter.convertToRoman(38));
    }

    @Test
    void whenArabic_48_ThenRoman_XLVIII() {
        Assertions.assertEquals("XLVIII", Converter.convertToRoman(48));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", Converter.convertToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        Assertions.assertEquals("LVIII", Converter.convertToRoman(58));
    }

    @Test
    void whenArabic_88_ThenRoman_LXXXVIII() {
        Assertions.assertEquals("LXXXVIII", Converter.convertToRoman(88));
    }

    @Test
    void whenArabic_98_ThenRoman_XCVIII() {
        Assertions.assertEquals("XCVIII", Converter.convertToRoman(98));
    }

    @Test
    void whenArabic_108_ThenRoman_CVIII() {
        Assertions.assertEquals("CVIII", Converter.convertToRoman(108));
    }

    @Test
    void whenArabic_198_ThenRoman_CXCVIII() {
        Assertions.assertEquals("CXCVIII", Converter.convertToRoman(198));
    }

    @Test
    void whenArabic_200_ThenRoman_CC() {
        Assertions.assertEquals("CC", Converter.convertToRoman(200));
    }

    @Test
    void whenArabic_420_ThenRoman_CDXX() {
        Assertions.assertEquals("CDXX", Converter.convertToRoman(420));
    }

    @Test
    void whenArabic_500_ThenRoman_D() {
        Assertions.assertEquals("D", Converter.convertToRoman(500));
    }

    @Test
    void whenArabic_595_ThenRoman_DXCV() {
        Assertions.assertEquals("DXCV", Converter.convertToRoman(595));
    }

    @Test
    void whenArabic_1000_ThenRoman_M() {
        Assertions.assertEquals("M", Converter.convertToRoman(1000));
    }

    @Test
    void whenArabic_1598_ThenRoman_MDXCIII() {
        Assertions.assertEquals("MDXCVIII", Converter.convertToRoman(1598));
    }
}
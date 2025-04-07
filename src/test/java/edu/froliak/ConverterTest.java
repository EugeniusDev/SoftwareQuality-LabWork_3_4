package edu.froliak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void whenRoman_null_ThenTrowNullPointerException() {
        Exception exception = Assertions.assertThrows(NullPointerException.class, ()-> Converter.romanToArabic(null));
        Assertions.assertSame(NullPointerException.class, exception.getClass());
        assertEquals("Input string of roman number can not be null", exception.getMessage());
    }

    @Test
    void whenRoman_emptyInputString_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic(""));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Input string of roman number can not be empty", exception.getMessage());
    }

    @Test
    void whenRomanHas_invalidCharacters_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("WX"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Invalid characters were entered", exception.getMessage());
    }

    @Test
    void whenRomanHas_lowercaseCharacters_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("ivx"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Roman string of numbers must be only in uppercase", exception.getMessage());
    }

    @Test
    void whenRomanHas_spaces_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("X I"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Invalid character: space", exception.getMessage());
    }

    @Test
    void whenRomanHas_nonExistentFormat_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("VVVV"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Invalid Roman numbers patterns", exception.getMessage());
    }

    @Test
    void whenRomanHas_cyrillicCharacters_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("ХІ"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Roman input string should not contain cyrillic characters", exception.getMessage());
    }

    @Test
    void whenRomanHas_negativeNumbers_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("-VI"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Negative numbers are not allowed", exception.getMessage());
    }

    @Test
    void whenRomanHas_pipe_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("V|"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Invalid character: pipe character", exception.getMessage());
    }

    @Test
    void whenRomanHas_underscore_ThenTrowIllegalArgumentException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Converter.romanToArabic("V_II"));
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        assertEquals("Invalid character: underscore character", exception.getMessage());
    }
}
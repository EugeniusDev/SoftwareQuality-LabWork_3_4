package edu.froliak;

import java.util.List;

/*
  @author eugen
  @project LabWork_3_4
  @class Converter
  @version 1.0.0
  @since 3/29/2025 - 16.32
*/public class Converter {
    public static int romanToArabic(String input) {
        if (input == null){
            throw new NullPointerException("Input string of roman number can not be null");
        }

        if(input.isEmpty()){
            throw new IllegalArgumentException("Input string of roman number can not be empty");
        }

        if (input.matches(".*[ХхСсІіМм].*")) {
            throw new IllegalArgumentException("Roman input string should not contain cyrillic characters");
        }

        if (input.matches(".*(IIII|XXXX|VVVV|CCCC|MMMM|LLLL|DDDD).*")) {
            throw new IllegalArgumentException("Invalid Roman numbers patterns");
        }

        if (input.contains(" ")) {
            throw new IllegalArgumentException("Invalid character: space");
        }

        if (input.startsWith("-")) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        if (input.contains("|")) {
            throw new IllegalArgumentException("Invalid character: pipe character");
        }

        if (input.contains("_")) {
            throw new IllegalArgumentException("Invalid character: underscore character");
        }

        if (!input.equals(input.toUpperCase())) {
            throw new IllegalArgumentException("Roman string of numbers must be only in uppercase");
        }

        if (!input.matches("^[IVXLCDM]+$")) {
            throw new IllegalArgumentException("Invalid characters were entered");
        }

        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((!romanNumeral.isEmpty()) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        return result;
    }
}

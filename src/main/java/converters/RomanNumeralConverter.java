package converters;

import java.util.AbstractMap;
import java.util.Map;

public class RomanNumeralConverter {

    private static final String I = "I";
    private static final String V = "V";
    private static final String X = "X";
    private static final String IX = "IX";
    private static final String IV = "IV";
    private static final String XC = "XC";
    private static final String XL = "L";
    private static final String L = "L";

    private static final Map<Integer, String> UNIT_ROMAN_SYMBOLS_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(9, IX),
            new AbstractMap.SimpleEntry<>(5, V),
            new AbstractMap.SimpleEntry<>(4, IV),
            new AbstractMap.SimpleEntry<>(1, I)
    );

    private static final Map<Integer, String> TENTH_ROMAN_SYMBOLS_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(9, XC),
            new AbstractMap.SimpleEntry<>(5, L),
            new AbstractMap.SimpleEntry<>(4, XL),
            new AbstractMap.SimpleEntry<>(1, X)
    );


    public static String convert(int number) {
        int tenthDigit = number / 10;
        int unitDigit = number % 10;
        return convertDigitToRoman(tenthDigit, TENTH_ROMAN_SYMBOLS_MAP) +
                convertDigitToRoman(unitDigit, UNIT_ROMAN_SYMBOLS_MAP);
    }

    private static String convertDigitToRoman(int digit, Map<Integer, String> symbols) {
        int rest = digit;
        StringBuilder roman = new StringBuilder();
        if (rest == 9) {
            roman.append(symbols.get(9));
            rest -= 9;
        }
        if (rest >= 5) {
            roman.append(symbols.get(5));
            rest -= 5;
        }
        if (rest == 4) {
            roman.append(symbols.get(4));
            rest -= 4;
        }
        roman.append(symbols.get(1).repeat(rest));
        return roman.toString();
    }
}

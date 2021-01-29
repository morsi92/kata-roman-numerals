package converters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RomanNumeralConverterTest {

    @Test
    public void should_return_I_when_input_is_1() {
        // Given
        int input = 1;
        String expectedRoman = "I";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_II_when_input_is_2() {
        // Given
        int input = 2;
        String expectedRoman = "II";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_III_when_input_is_3() {
        // Given
        int input = 3;
        String expectedRoman = "III";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_IV_when_input_is_4() {
        // Given
        int input = 4;
        String expectedRoman = "IV";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_V_when_input_is_5() {
        // Given
        int input = 5;
        String expectedRoman = "V";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_VI_when_input_is_6() {
        // Given
        int input = 6;
        String expectedRoman = "VI";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_IX_when_input_is_9() {
        // Given
        int input = 9;
        String expectedRoman = "IX";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_X_when_input_is_10() {
        // Given
        int input = 10;
        String expectedRoman = "X";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_XI_when_input_is_11() {
        // Given
        int input = 11;
        String expectedRoman = "XI";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_XIX_when_input_is_19() {
        // Given
        int input = 19;
        String expectedRoman = "XIX";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_XX_when_input_is_20() {
        // Given
        int input = 20;
        String expectedRoman = "XX";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_XX_when_input_is_24() {
        // Given
        int input = 24;
        String expectedRoman = "XXIV";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }

    @Test
    public void should_return_LXXV_when_input_is_75() {
        // Given
        int input = 75;
        String expectedRoman = "LXXV";
        // When
        String roman = RomanNumeralConverter.convert(input);

        // Then
        assertThat(roman).isEqualTo(expectedRoman);
    }


}
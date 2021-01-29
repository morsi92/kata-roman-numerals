package converters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumeralConverterTest {

    @Test
    public void should_return_I_when_input_is_1() {
        // Given
        int input = 1;
        String expectedOutput = "I";

        // When
        String currentOutput = RomanNumeralConverter.convert(input);

        // Then
        Assertions.assertThat(currentOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_II_when_input_is_2() {
    }

    @Test
    public void should_return_III_when_input_is_3() {
    }


    @Test
    public void should_return_V_when_input_is_5() {
    }

    @Test
    public void should_return_VI_when_input_is_6() {
    }

    @Test
    public void should_return_VIII_when_input_is_8() {
    }

    @Test
    public void should_return_IV_when_input_is_4() {
    }

    @Test
    public void should_return_IX_when_input_is_9() {
    }

    @Test
    public void should_return_X_when_input_is_10() {
    }

    @Test
    public void should_return_XX_when_input_is_20() {
    }

    @Test
    public void should_return_XXX_when_input_is_30() {
    }

    @Test
    public void should_return_L_when_input_is_50() {
    }

    @Test
    public void should_return_LXXX_when_input_is_80() {
    }

    @Test
    public void should_return_XL_when_input_is_40() {
    }

    @Test
    public void should_return_XC_when_input_is_90() {
    }

    @Test
    public void should_return_XIX_when_input_is_19() {
    }

    @Test
    public void should_return_LXXV_when_input_is_75() {
    }


}
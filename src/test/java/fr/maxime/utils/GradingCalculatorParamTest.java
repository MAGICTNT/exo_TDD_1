package fr.maxime.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GradingCalculatorParamTest {

    @ParameterizedTest
    @CsvSource({
            "95, 90, A",
            "85, 90, B",
            "65, 90, C",
            "95, 65, B",
            "95, 55, F",
            "65, 55, F",
            "50, 90, F"
    })

    public void testGradingCalculatorParameterized(int score, int attendancePercentage, char attenduValue) {
        GradingCalculator calculator = new GradingCalculator(score, attendancePercentage);
        Assertions.assertEquals(attenduValue, calculator.getGrade());
    }
}

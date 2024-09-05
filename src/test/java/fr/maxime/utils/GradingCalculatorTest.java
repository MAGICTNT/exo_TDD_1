package fr.maxime.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
    private GradingCalculator calculator;

    @Test
    public void TestGradingCalculator_score_95_attendance_90_thenResult_A() {
        calculator = new GradingCalculator(95, 90);

        char attenduValue = 'A';
        Assertions.assertEquals(attenduValue, calculator.getGrade());
    }
    @Test
    public void TestGradingCalculator_score_85_attendance_90_thenResult_B() {
        calculator = new GradingCalculator(85, 90);
        char attenduValue = 'B';
        Assertions.assertEquals(attenduValue, calculator.getGrade());

    }
    @Test
    public void TestGradingCalculator_score_65_attendance_90_thenResult_C() {
        calculator = new GradingCalculator(65, 90);
        char attenduValue = 'C';
        Assertions.assertEquals(attenduValue, calculator.getGrade());

    }
    @Test
    public void TestGradingCalculator_score_95_attendance_65_thenResult_B() {
        calculator = new GradingCalculator(95, 65);
        char attenduValue = 'B';
        Assertions.assertEquals(attenduValue, calculator.getGrade());

    }
    @Test
    public void TestGradingCalculator_score_95_attendance_55_thenResult_F() {
        calculator = new GradingCalculator(95, 55);
        char attenduValue = 'F';
        Assertions.assertEquals(attenduValue, calculator.getGrade());

    }
    @Test
    public void TestGradingCalculator_score_65_attendance_55_thenResult_F() {
        calculator = new GradingCalculator(65, 55);
        char attenduValue = 'F';
        Assertions.assertEquals(attenduValue, calculator.getGrade());

    }
    @Test
    public void TestGradingCalculator_score_50_attendance_90_thenResult_F() {
        calculator = new GradingCalculator(50, 90);
        char attenduValue = 'F';
        Assertions.assertEquals(attenduValue, calculator.getGrade());
    }

}

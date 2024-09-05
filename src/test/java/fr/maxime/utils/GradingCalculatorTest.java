package fr.maxime.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
    private GradingCalculator calculator;
    private int score;
    private int attendancePercentage;
    private char attenduValue;


    @Test
    public void TestGradingCalculator_score_95_attendance_90_thenResult_A() {
        score = 95;
        attendancePercentage = 90;
        attenduValue = 'A';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);
    }
    @Test
    public void TestGradingCalculator_score_85_attendance_90_thenResult_B() {
        score = 85;
        attendancePercentage = 90;
        attenduValue = 'B';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);

    }
    @Test
    public void TestGradingCalculator_score_65_attendance_90_thenResult_C() {
        score = 65;
        attendancePercentage = 90;
        attenduValue = 'C';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);

    }
    @Test
    public void TestGradingCalculator_score_95_attendance_65_thenResult_B() {
        score = 95;
        attendancePercentage = 65;
        attenduValue = 'B';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);

    }
    @Test
    public void TestGradingCalculator_score_95_attendance_55_thenResult_F() {
        score = 95;
        attendancePercentage = 55;
        attenduValue = 'F';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);

    }
    @Test
    public void TestGradingCalculator_score_65_attendance_55_thenResult_F() {
        score = 65;
        attendancePercentage = 55;
        attenduValue = 'F';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);

    }
    @Test
    public void TestGradingCalculator_score_50_attendance_90_thenResult_F() {
        score = 50;
        attendancePercentage = 90;
        attenduValue = 'F';

        calculator = new GradingCalculator(score, attendancePercentage);
        char grade = calculator.getGrade();

        Assertions.assertEquals(attenduValue, grade);
    }

}

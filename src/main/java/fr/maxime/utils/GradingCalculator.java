package fr.maxime.utils;

public class GradingCalculator {
    public int Score;
    public int AttendancePercentage;

    public GradingCalculator(int score, int attendancePercentage) {
        Score = score;
        AttendancePercentage = attendancePercentage;
    }

    public char getGrade() {
        if(this.Score > 90 && this.AttendancePercentage > 70) return 'A';
        else if(this.Score > 80 && this.AttendancePercentage > 60) return  'B';
        else if (this.Score > 60 && this.AttendancePercentage > 60) return  'C';
        else return 'F';
    }
}

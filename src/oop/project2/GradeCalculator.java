package oop.project2;

import java.util.ArrayList;

public class GradeCalculator {

    public final String name;
    public final double currentScore;
    public final int currentCredit;

    public final ArrayList<Course> courses = new ArrayList<>();

    public GradeCalculator(String name, double scoreAverage, int creditSums) {
        this.name = name;
        currentScore = scoreAverage;
        currentCredit = creditSums;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void print() {
        System.out.printf("직전 학기 성적: %.1f (총 %d학점)\n",
                currentScore, currentCredit);

        double scoreSum = 0;
        int creditSum = 0;
        for (Course c : courses) {
            scoreSum += c.score * c.credit;
            creditSum += c.credit;
        }

        System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n",
                (scoreSum / creditSum), creditSum);

        double totalScore = currentScore * currentCredit + scoreSum;
        int totalCredit = currentCredit + creditSum;

        System.out.printf("전체 예상 학점: %.10f (총 %d학점)\n", totalScore, totalCredit);
    }
}

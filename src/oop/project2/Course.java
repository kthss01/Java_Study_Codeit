package oop.project2;

public class Course {
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    public final String name;
    public final int credit;
    double score;

    public double getScore() {
        return score;
    }

    public int getCredit() {
        return credit;
    }

    public Course(String name, int credit, String grade) {
        this.name = name;
        this.credit = credit;
        score = getScore(grade);
    }

    public double getScore(String grade) {

        switch (grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
            default:
                return 0.0;
        }
    }
}

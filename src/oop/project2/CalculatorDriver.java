package oop.project2;

/**
 * 학점 계산기
 *
 * 학점 계산 방법
 *  1. 이전 학기까지의 평균 점수 (4.5 만점)
 *  2. 이전 학기까지의 이수 크레딧 수
 *      (전공과목(CREDIT_MAJOR)은 3학점 교약 과목(CREDIT_GENERAL)은 2학점)
 *  3. 이번 학기 과목별 예상 성적
 *
 *  전체 점수 예상
 *  이전 학기까지의 평균 점수 * 이전 학기까지의 크레딧 수
 *      = 이전 학기까지의 총 점수
 *  총 점수 = 이전 학기까지의 총 점수 + 이번 학기의 총 점수
 *  총 이수 크레딧 수 = 이전 학기까지의 크레딧 수 + 이번 학기의 크레딧 수
 *  전체 점수 = 총 점수 / 총 이수 크레딧 수수
 */

public class CalculatorDriver {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print();
    }
}

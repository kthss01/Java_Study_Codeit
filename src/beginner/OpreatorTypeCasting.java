package beginner;/*
    연산자와 형 변환

    국어(koreanScore) 86점,
    수학(mathScore) 94점,
    과학(scienceScore) 87점,
    컴퓨터(computerScore) 100점

    평균 점수(average) 구하고 소수로 출력하기기
 */

public class OpreatorTypeCasting {
    public static void main(String[] args) {
        // 각 과목 점수
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        // 평균 점수
        double average = (koreanScore + mathScore + scienceScore + computerScore) / 4.0;
        System.out.println(average);
    }
}

package beginner;/*
    자기소개서 만들기

    변수 정의
    이름 (name)
    생일 - 년도 (year)
    생일 - 월 (month)
    생일 - 일 (day)
    결혼 여부 (married)

    값 대입
    "코드잇"
    2015
    7
    20
    false

    결과 출력
    이름: 코드잇
    생일: 2015년 7월 20일
    결혼: false
 */

public class Introduce {
    public static void main(String[] args) {
        // 변수 정의 (자료형 잘 선정해서)
        String name;
        int year;
        int month;
        int day;
        boolean married;

        // 값 대입
        name = "코드잇";
        year = 2015;
        month = 7;
        day = 20;
        married = false;

        // 자기 소개
        System.out.printf("이름: %s\n", name);
        System.out.printf("생일: %d년 %d월 %d일\n", year, month, day);
        System.out.printf("결혼: %b\n", married);
//        System.out.printf("");

    }
}
